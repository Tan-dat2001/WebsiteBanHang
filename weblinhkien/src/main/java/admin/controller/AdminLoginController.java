package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDAO;
import models.Admin;

@WebServlet(urlPatterns = "/quan-tri")
public class AdminLoginController extends HttpServlet{

	private static final long serialVersionUID = 756320392073278933L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if (session.getAttribute("adminloginsuccess") == null){
			RequestDispatcher rq = req.getRequestDispatcher("/views/adm.jsp");
			rq.forward(req, resp);
			}
		else {
			resp.sendRedirect("admin-home");
			}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String acc = req.getParameter("tenDangNhap");
		String pass = req.getParameter("matKhau");
		
		AdminDAO adminDAO = new AdminDAO();
		Admin adm = adminDAO.getAdminAccount(acc, pass);
		
		if (adm == null){
			req.setAttribute("adminlogin", "Đăng nhập thất bại !");
			RequestDispatcher rq = req.getRequestDispatcher("/views/adm.jsp");
			rq.forward(req, resp);
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("adminloginsuccess", adm.getAdminName());
			/*session.setMaxInactiveInterval(10);*/
			resp.sendRedirect("admin-home");
		}
		
	}
}
