package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dao.DAO;
import models.CategoryProduct;
import models.Item;
import models.Product;
import models.Cart;

/**
 * Servlet implementation class home
 */
@WebServlet(name = "home", urlPatterns = { "/web-home" })
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// GET DATA TỪ DAO
		DAO dao = new DAO();
		CategoryDAO categoryDAO = new CategoryDAO();
		List<CategoryProduct> listCategory = categoryDAO.getAllCategoryProducts();
		List<Product> listProduct = dao.getAllProduct();
        Cookie[] arr = request.getCookies();
        String txt ="";
        if(arr!=null) {
        	for(Cookie o:arr) {
        		if(o.getName().equals("cart")) {
        			txt+=o.getValue();
        		}
        	}
        }
        System.out.println("Product Ids = " + txt);
		/*
		 * Cart cart = new Cart(txt,listProduct); List<Item> listItem = cart.getItems();
		 * int n ; if(listItem !=null) { n = listItem.size(); }else { n=0; }
		 */
		// SET DATA TỪ JSP
		request.setAttribute("listCategory", listCategory);
		request.setAttribute("listProduct", listProduct);
		 Cart cart = new Cart(txt, listProduct);
	        List<Item> listItem = cart.getItems();      
	     request.setAttribute("cart", cart);
	    request.setAttribute("size", listItem.size());
	    listProduct.forEach(e -> {
	    	System.out.println("==============> Cart" + e.getProductName());
	    });
	    
		RequestDispatcher rqDispatcher = request.getRequestDispatcher("views/web/home.jsp");
		rqDispatcher.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);

	}

	
}
