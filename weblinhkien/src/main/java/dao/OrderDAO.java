package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import context.DBContext;
import models.Cart;
import models.Item;
import models.User;

public class OrderDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

		public void addOrder(User user, Cart cart) throws Exception {
			LocalDate curDate = java.time.LocalDate.now();
			String date = curDate.toString();
			try {
				System.out.println("===> add Order === Starting........");
				String query = "insert into oder (id_user, date_order, total_money) values (?, ?, ?) ";
				Connection conn = new DBContext().getConnection();
				PreparedStatement ps = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
				System.out.println("===> add Order === Set value for param query");
				System.out.println("===> UserId: " + user.getUserID());
				System.out.println("===> Date: " + date);
				System.out.println("===> Total Money: " + cart.getTotalMoney());
				ps.setInt(1, user.getUserID());
				ps.setString(2, date);
				ps.setDouble(3, cart.getTotalMoney());
				System.out.println("===> add Order === Start query");
				ps.executeUpdate();
				System.out.println("===> add Order === Finished query");
	            ps.close();
	            System.out.println("===> add Order === Finished");
				
				// lấy id của order vừa add
				String sql = "select max(id_order) as id_order from oder";
				PreparedStatement st = conn.prepareStatement(sql);
				ResultSet rs1 = st.executeQuery();
				if (rs1.next()) {
					int id_order = rs1.getInt("id_order");
					for (Item i : cart.getItems()) {
						System.out.println("===> add Order === Starting create order detail with PRODUCT ID: " + i.getProduct().getProductID());
						String sql2 = "insert into detail_order (id_order, id_product, amount, price) values(?, ?, ?, ?)";
						PreparedStatement st2 = conn.prepareStatement(sql2, PreparedStatement.RETURN_GENERATED_KEYS);
						st2.setInt(1, id_order);
						st2.setInt(2, i.getProduct().getProductID());
						st2.setInt(3, i.getQuantity());
						st2.setDouble(4, i.getPrice());
						st2.executeUpdate();
						System.out.println("===> add Order === Finished create order detail with PRODUCT ID: " + i.getProduct().getProductID());
					}
				}
				st.close();
				String sql3 = "update product set amount=amount-? where id_product=? ";
				PreparedStatement st3 = conn.prepareStatement(sql3);
				for (Item i : cart.getItems()) {
					System.out.println("===> add Order === Starting update amount product with PRODUCT ID: " + i.getProduct().getProductID());
					st3.setInt(1, i.getQuantity());
					st3.setInt(2, i.getProduct().getProductID());
					st3.executeUpdate();
					System.out.println("===> add Order === Finished update amount product with PRODUCT ID: " + i.getProduct().getProductID());

				}
				st3.close();
	            conn.close();
			} catch (SQLException e) {
				System.out.println("Exception with error code " + e.getErrorCode() + " and error message ===> " + e.getMessage());
			}

		}
	
	public void deleteOrderByID(int ID) {
		String queryDelete = "delete from oder where id_order = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(queryDelete);
			ps.setLong(1, ID);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
