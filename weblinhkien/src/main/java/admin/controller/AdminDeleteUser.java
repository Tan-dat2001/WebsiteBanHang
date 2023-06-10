package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet(urlPatterns = "/delete-user")
public class AdminDeleteUser extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =  req.getParameter("user_id");
		int std_id = Integer.parseInt(id);
		UserDAO userDAO = new UserDAO();
		userDAO.deletedUserByID(std_id);
		resp.sendRedirect("admin-user");
	}
}
