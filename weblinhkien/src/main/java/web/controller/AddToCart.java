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
import models.Cart;
import models.Item;
import models.Product;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		/*
		 * HttpSession session = request.getSession(true); Cart cart = null; Object o =
		 * session.getAttribute("cart"); if(o != null) { cart = (Cart)o; }else { cart =
		 * new Cart(); }
		 * 
		 * String soluong = request.getParameter("amount"); String id =
		 * request.getParameter("productID"); int amount, productID; try { amount =
		 * Integer.parseInt(soluong); productID = Integer.parseInt(id); DAO dao = new
		 * DAO(); Product product = dao.getProductByID(productID); double price =
		 * product.getProductPrice(); Item t = new Item(product,amount,price);
		 * cart.addItem(t); }catch(NumberFormatException E) { amount = 1;
		 * 
		 * }
		 * 
		 * List<Item> list = cart.getItems(); session.setAttribute("cart", cart);
		 * session.setAttribute("size", list.size());
		 * request.getRequestDispatcher("views/web/shoppingCart.jsp").forward(request,
		 * response);
		 */
		HttpSession session = request.getSession();
		String sthString = (String)session.getAttribute("userloginsuccess");
		if (sthString == null) {
			response.sendRedirect("dang-nhap");
		}else {
		DAO dao = new DAO();
		List<Product> list = dao.getAllProduct()	;
		Cookie[] arr = request.getCookies();
		String txt ="";
		if(arr!=null) {
			for(Cookie o:arr) {
				if(o.getName().equals("cart")) {
					txt+=o.getValue();
					o.setMaxAge(0);
					response.addCookie(o);
				}
			}
		}
		String num_raw = request.getParameter("num");
		String id_raw= request.getParameter("productID");
		if(txt.isEmpty()) {
			txt=id_raw+":"+num_raw;
		}else {
			txt=txt+"-"+id_raw+":"+num_raw;
		}

		Cookie c = new Cookie("cart", txt);
		// muốn cái product tồn tại 2 ngày
		c.setMaxAge(2*24*60*60);
		response.addCookie(c);	
		Cart cart = new Cart(txt,list);
		List<Item> listItem = cart.getItems();      
		request.setAttribute("cart", cart);
		request.setAttribute("size", listItem.size());
		request.getRequestDispatcher("web-home").forward(request, response);

		response.sendRedirect("web-home");
	}
	}
}
