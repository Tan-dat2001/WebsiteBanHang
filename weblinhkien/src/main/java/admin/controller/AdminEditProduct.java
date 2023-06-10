package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import models.Product;

@WebServlet(urlPatterns = "/admin-edit-product")
public class AdminEditProduct extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("idproduct"));
		Product product = new ProductDAO().getProductByID(id);
		req.setAttribute("productt", product);
		
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/product/formEditProduct.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("idproduct");
		if(id != null) {
			String nameProduct = req.getParameter("tenLinhKiencapnhat");
			String imageLink = req.getParameter("hinhAnhcapnhat");
			String manufactID = req.getParameter("loaiLinhKiencapnhat");
			String categoryID = req.getParameter("hangSXcapnhat");
			String amount = req.getParameter("soLuongcapnhat");
			String describe = req.getParameter("moTacapnhat");
			String price = req.getParameter("giaTiencapnhat");
			try {
				int idd = Integer.parseInt(id);
				Float pricee = Float.parseFloat(price);
				int amountt = Integer.parseInt(amount);
				int manufactt = Integer.parseInt(manufactID);
				int category = Integer.parseInt(categoryID);
				Product product = new Product(0, nameProduct, pricee, describe, amountt, manufactt, category, imageLink);
				ProductDAO productDAO = new ProductDAO();
				productDAO.updateProductByID(idd, product);
				
			} catch (Exception e) {
				
			}
			
		}
		resp.sendRedirect("admin-product");
	}
	
}
