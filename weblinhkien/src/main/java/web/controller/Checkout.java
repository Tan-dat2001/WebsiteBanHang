package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAO;
import dao.OrderDAO;
import models.Cart;
import models.Product;
import models.User;

/**
 * Servlet implementation class Checkout
 */
@WebServlet("/checkout")
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("=== doPost ===> Starting......");
		
		OrderDAO dao = new OrderDAO();
		DAO d = new DAO();
		List<Product> list = d.getAllProduct()	;
		Cookie[] arr = request.getCookies();
		String txt ="";
		if(arr!=null) {
			for(Cookie o:arr) {
				if(o.getName().equals("cart")) {
					txt+=o.getValue();
				}
			}
		}
		System.out.println("=== doPost ===> set cart......");
		Cart cart = new Cart(txt, list);
		HttpSession session= request.getSession();
		User a= (User)session.getAttribute("user");
		System.out.println("get user string ===> " + session.getAttribute("user"));
		if (a == null) {
			System.out.println("=== doPost ===> BACK TO Login ");
			response.sendRedirect("dang-nhap");
		}else {			
			try {
				System.out.println("=== Try ===> ");
				dao.addOrder(a, cart);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("=== Error ===> "+ e.getMessage());
				e.printStackTrace();
			}
			Cookie c = new Cookie("cart","");
			System.out.println("--------------------"+c);
			c.setMaxAge(0);
			response.addCookie(c);
			response.sendRedirect("web-home");
		}
	}

}