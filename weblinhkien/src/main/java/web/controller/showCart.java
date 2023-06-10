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
import javax.servlet.http.HttpSession;

import dao.CategoryDAO;
import dao.DAO;
import models.Cart;
import models.CategoryProduct;
import models.Item;
import models.Product;

/**
 * Servlet implementation class showCart
 */
@WebServlet("/showCart")
public class showCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String sthString = (String)session.getAttribute("userloginsuccess");
		if (sthString == null) {
			response.sendRedirect("dang-nhap");
		}else {
			DAO dao = new DAO();
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
	        Cart cart = new Cart(txt,listProduct);
	        List<Item> listItem = cart.getItems();   
	        request.setAttribute("cart", cart);
	        request.setAttribute("size", listItem.size());
	        request.getRequestDispatcher("views/web/shoppingCart.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
