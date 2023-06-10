package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import context.DBContext;
import models.Order;
import models.Product;

public class DAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<>();
		String query = "select * from product order by id_product desc";

		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getNString(4), rs.getInt(5),
						rs.getInt(7), rs.getInt(6), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public Product getProductByID(int id) {
		String query = "select * from product\n" + " where id_product = ?";

		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getNString(4), rs.getInt(5),
						rs.getInt(7), rs.getInt(6), rs.getString(8));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public List<Product> getSearchProduct(String search) {
		List<Product> list = new ArrayList<>();
		String query = "select * from product " + "where name_product like ?";

		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + search + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getNString(4), rs.getInt(5),
						rs.getInt(7), rs.getInt(6), rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<Order> getAllOrders(){
		List<Order> list = new ArrayList<>();
		String query = "select * from oder";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				list.add(new Order(rs.getInt(1),
						rs.getInt(2),
						rs.getDate(3),
						rs.getFloat(4)));	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DAO dao = new DAO();
	List<Product> tProduct = dao.getAllProduct();
	for (Product product : tProduct) {
		System.out.println(tProduct);
	}
	

	}

}
