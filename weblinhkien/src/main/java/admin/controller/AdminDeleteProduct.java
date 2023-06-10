package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dao.UserDAO;

@WebServlet(urlPatterns = "/delete-product")
public class AdminDeleteProduct extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =  req.getParameter("product_id");
		int std_id = Integer.parseInt(id);
		ProductDAO productDAO = new ProductDAO();
		productDAO.deleteProductByID(std_id);
		resp.sendRedirect("admin-product");
	}
}
