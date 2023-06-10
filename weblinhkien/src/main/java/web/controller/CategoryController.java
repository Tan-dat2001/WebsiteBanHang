package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import models.CategoryProduct;
import models.Product;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/web-category")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//lấy idCategory
		String categoryId = request.getParameter("categoryProductID");
		CategoryDAO categoryDAO = new CategoryDAO();
		List<CategoryProduct> listCategory = categoryDAO.getAllCategoryProducts();
		List<Product> listProduct = categoryDAO.getAllProductByCategory(categoryId);
		request.setAttribute("listCategory", listCategory);
		request.setAttribute("listProduct", listProduct);
		//request.setAttribute("active", categoryId);
		request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
	}

	

}
