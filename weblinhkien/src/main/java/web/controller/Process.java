package web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import models.Cart;
import models.Item;
import models.Product;

/**
 * Servlet implementation class Process
 */
@WebServlet("/process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * HttpSession session = request.getSession(true); Cart cart = null; Object o =
		 * session.getAttribute("cart"); if(o != null) { cart = (Cart)o; }else { cart =
		 * new Cart(); }
		 * 
		 * String soluong = request.getParameter("amount").trim(); String id =
		 * request.getParameter("id"); int amount, productID; try { amount =
		 * Integer.parseInt(soluong); productID = Integer.parseInt(id); if((amount ==
		 * -1) && (cart.getQuantityById(productID) <= 1)) { cart.removeItem(productID);
		 * }else {
		 * 
		 * DAO dao = new DAO(); Product product = dao.getProductByID(productID); double
		 * price = product.getProductPrice(); Item t = new Item(product,amount,price);
		 * cart.addItem(t); } }catch(NumberFormatException E) { // amount = 1;
		 * System.out.println(E); }
		 * 
		 * List<Item> list = cart.getItems(); session.setAttribute("cart", cart);
		 * session.setAttribute("size", list.size());
		 * request.getRequestDispatcher("views/web/shoppingCart.jsp").forward(request,
		 * response); }
		 */

		DAO d = new DAO();
		List<Product> list = d.getAllProduct();
		Cookie[] arr = request.getCookies();
		String txt ="";
		if (arr != null) {
			for (Cookie o : arr) {
				if (o.getName().equals("cart")) {
					txt += o.getValue();
					o.setMaxAge(0);
					response.addCookie(o);
				}
			}
		}
		
		Cart cart = new Cart(txt, list);
		String num_raw = request.getParameter("num");
		String id_raw = request.getParameter("id");
		int id, num;
		try {
			id = Integer.parseInt(id_raw);
			Product p = d.getProductByID(id);
			int numStore = p.getAmount();
			System.out.println("---------------------"+numStore);
			num = Integer.parseInt(num_raw);
			if (num == -1 && (cart.getQuantityById(id) <= 1)) {
				cart.removeItem(id);
			} else {
				if (num == 1 && cart.getQuantityById(id) >= numStore) {
					num = 0;
				}
				double price = p.getProductPrice();
				Item t = new Item(p, num, price);
				cart.addItem(t);
			}

		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		List<Item> items = cart.getItems();
		txt ="";
		if (items.size() > 0) {
			
			txt = items.get(0).getProduct().getProductID() + ":" + items.get(0).getQuantity();
			for (int i = 1; i < items.size(); i++) {
				txt += "-" + items.get(i).getProduct().getProductID() + ":" + items.get(i).getQuantity();
				
			}
			System.out.println("-----------------"+txt);
		}
		
		Cookie c = new Cookie("cart", txt);
		c.setMaxAge(2 * 24 * 60 * 60);
		response.addCookie(c);
		request.setAttribute("cart", cart);
		request.getRequestDispatcher("views/web/shoppingCart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * HttpSession session = request.getSession(true); Cart cart = null; Object o =
		 * session.getAttribute("cart"); if(o != null) { cart = (Cart)o; }else { cart =
		 * new Cart(); }
		 * 
		 * int id= Integer.parseInt(request.getParameter("id")); cart.removeItem(id);
		 * 
		 * List<Item> list = cart.getItems(); session.setAttribute("cart", cart);
		 * session.setAttribute("size", list.size());
		 * request.getRequestDispatcher("views/web/shoppingCart.jsp").forward(request,
		 * response);
		 */
		DAO d = new DAO();
		List<Product> list = d.getAllProduct();
		Cookie[] arr = request.getCookies();
		String txt ="";
		if (arr != null) {
			for (Cookie o : arr) {
				if (o.getName().equals("cart")) {
					txt+= o.getValue();
					o.setMaxAge(0);
					response.addCookie(o);
				}
			}
		}
		String id= request.getParameter("ID");
		String[] ids= txt.split("-");
		String out="";
		for(int i=0; i<ids.length;i++) {
			String[] s=ids[i].split(":");
			if(!s[0].equals(id)) {
				if(out.isEmpty()) {
					out=ids[i];
				}
				else{
					out+="-"+ids[i];
				
				}
			}
		}
//		nếu có tồn tại
		if(!out.isEmpty()) {
			Cookie c = new Cookie("cart", out);
			c.setMaxAge(2*24*60*60);
			response.addCookie(c);
			
		}
		
		Cart cart = new Cart(out, list);
		request.setAttribute("cart", out);
		response.sendRedirect("showCart");
	}
}
