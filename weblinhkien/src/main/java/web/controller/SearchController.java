package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.DAO;
import models.CategoryProduct;
import models.Product;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/Search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String search = request.getParameter("search");
		DAO dao = new DAO();
		CategoryDAO categoryDAO = new CategoryDAO();
		List<CategoryProduct> listCategory = categoryDAO.getAllCategoryProducts();
		List<Product> listProduct = dao.getSearchProduct(search);
		request.setAttribute("listCategory", listCategory);
		request.setAttribute("listProduct", listProduct);
		request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
	}

}
