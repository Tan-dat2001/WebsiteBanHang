package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import models.User;


@WebServlet(urlPatterns = {"/dang-nhap"})
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 6181142478344850180L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			HttpSession session = req.getSession();
			if (session.getAttribute("userloginsuccess") == null) {
				RequestDispatcher rq = req.getRequestDispatcher("views/login.jsp");
				rq.forward(req, resp);
				}
			else {
				resp.sendRedirect("web-home");
				}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acc = req.getParameter("tenDangNhap");
		String pass = req.getParameter("matKhau");		
		UserDAO userDAO = new UserDAO();
		User user = userDAO.getUserAccount(acc, pass);
		if (user == null) {
			req.setAttribute("userlogin", "Đăng nhập thất bại !");
			RequestDispatcher rq = req.getRequestDispatcher("views/login.jsp");
			rq.forward(req, resp);
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			session.setAttribute("userloginsuccess", user.getUserName());
			session.setAttribute("userloginsuccessID", user.getUserID());
			/*session.setMaxInactiveInterval(10);*/
			req.setAttribute("user", user);
			req.setAttribute("id", user.getUserID());
			req.setAttribute("user", user.getUserName());
			req.getRequestDispatcher("views/web/home.jsp").forward(req, resp);
			resp.sendRedirect("web-home");
		}
	}
}
