package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;

@WebServlet(urlPatterns = "/delete-category")
public class AdminDeleteCategory extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id =  req.getParameter("category_id");
		int std_id = Integer.parseInt(id);
		CategoryDAO categoryDAO = new CategoryDAO();
		categoryDAO.deletedCategoryByID(std_id);
		resp.sendRedirect("admin-product");
	}
}
