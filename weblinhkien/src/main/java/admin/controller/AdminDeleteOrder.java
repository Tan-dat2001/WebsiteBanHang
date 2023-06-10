package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OrderDAO;

@WebServlet(urlPatterns = "/admin-delete-order")
public class AdminDeleteOrder extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =  req.getParameter("order_id");
		int std_id = Integer.parseInt(id);
		OrderDAO orderDAO = new OrderDAO();
		orderDAO.deleteOrderByID(std_id);
		resp.sendRedirect("admin-order");
	}
	
}
