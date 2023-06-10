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

@WebServlet(urlPatterns = "/admin-add-product")
public class AdminAddProduct extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/product/formAddProduct.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();
		String nameProduct = req.getParameter("tenLinhKien");
		String imageLink = req.getParameter("hinhAnh");
		String manufactID = req.getParameter("loaiLinhKien");
		String categoryID = req.getParameter("hangSX");
		String amount = req.getParameter("soLuong");
		String describe = req.getParameter("moTa");
		String price = req.getParameter("giaTien");
		
		try {
			Float pricee = Float.parseFloat(price);
			int amountt = Integer.parseInt(amount);
			int manufactt = Integer.parseInt(manufactID);
			int category = Integer.parseInt(categoryID);
			Product product = new Product(0, nameProduct, pricee, describe, amountt, manufactt, category, imageLink);
			ProductDAO productDAO = new ProductDAO();
			productDAO.createProduct(product);
			session.setAttribute("showMessProduct", "Thêm sản phẩm thành công.");
			session.setMaxInactiveInterval(2);
			resp.sendRedirect("admin-add-product");
		} catch (Exception e) {
			session.setAttribute("showMessProduct", "Không đủ thông tin !");
			session.setMaxInactiveInterval(2);
			resp.sendRedirect("admin-add-product");
		}
		
	}
}

