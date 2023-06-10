package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import models.Product;

/**
 * Servlet implementation class DetailController
 */
@WebServlet("/detailProduct")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("productID");
		int productID = Integer.parseInt(id);
		DAO dao = new DAO();
		Product product = dao.getProductByID(productID);
		request.setAttribute("detail", product);
		request.getRequestDispatcher("views/web/detail.jsp").forward(request, response);
	}


}
