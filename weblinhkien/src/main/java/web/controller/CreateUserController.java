package web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import models.User;

@WebServlet(urlPatterns = "/create-user")
public class CreateUserController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();
		String acc = req.getParameter("account");
		User user = new UserDAO().existsAccount(acc);
		if (user != null) {
			session.setAttribute("showMess", "Tài khoản đã tồn tại !");
			session.setMaxInactiveInterval(2);
			resp.sendRedirect("dang-ky");
		}else {
			String username = req.getParameter("tenNguoiDung");
			String birthday= req.getParameter("ngaySinh");
			String accc = req.getParameter("account");
			String pass = req.getParameter("matKhau");
			String phone = req.getParameter("sdt");
			String diaChi = req.getParameter("diaChi");
				java.util.Date utilDate = new java.util.Date();
				try {
					utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				User usernew = new User(0, username, pass, accc, sqlDate, diaChi, phone);
				UserDAO userDAO = new UserDAO();
				userDAO.createUserAccount(usernew);
				session.setAttribute("showMess", "Đăng ký tài khoản thành công");
				session.setMaxInactiveInterval(2);
				resp.sendRedirect("dang-ky");
		}
	}
}
