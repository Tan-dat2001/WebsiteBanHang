package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;

@WebServlet(urlPatterns = "/admin-add-category")
public class AdminAddCategory extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String somethingInput = req.getParameter("addcategory");
		if (somethingInput.trim().length() > 0) {
			CategoryDAO categoryDAO = new CategoryDAO();
			categoryDAO.createCategory(somethingInput);
		}
		resp.sendRedirect("admin-product");
	}
}
