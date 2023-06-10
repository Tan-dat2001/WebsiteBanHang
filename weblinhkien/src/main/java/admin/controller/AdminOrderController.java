package admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import models.Order;

@WebServlet(urlPatterns = "/admin-order")
public class AdminOrderController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DAO dao = new DAO();
		List<Order> listOrders = dao.getAllOrders();
		req.setAttribute("listOrders", listOrders);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/admin/Order/listOrder.jsp");
		dispatcher.forward(req, resp);
	}
}
