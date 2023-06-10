package admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import models.User;

@WebServlet(urlPatterns = "/update-user")
public class AdminUpdatedUser extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("idupdate"));
		User user = new UserDAO().getUserByID(id);
		req.setAttribute("user", user);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/user/update.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("idupdate");
		if (id != null){
			String name = req.getParameter("tenNguoiDungcapnhat");
			String birthday = req.getParameter("ngaySinhcapnhat");
			String std = req.getParameter("sdtcapnhat");
			String address = req.getParameter("diaChicapnhat");
			
			try {
				int idd = Integer.parseInt(id);
				User user = new User(idd, name, "", "", Date.valueOf(birthday), address, std);
				UserDAO userDAO = new UserDAO();
				userDAO.updateUserByID(idd, user);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		resp.sendRedirect("admin-user");
	}
	
}
