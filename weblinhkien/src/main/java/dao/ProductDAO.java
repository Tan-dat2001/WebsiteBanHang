package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import models.Product;

public class ProductDAO extends DBContext {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

//	public List<Product> getAll() {
//		List<Product> list = new ArrayList<>();
//		String query = "select * from product";
//		try {
//			conn = new DBContext().getConnection();
//			ps = conn.prepareStatement(query);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				Product p = new Product(
//						rs.getInt("productID"), 
//						rs.getString("productName"),
//						rs.getFloat("productPrice"), 
//						rs.getInt("amount"));
//
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return list;
//	}
//
	public Product getProductByID(int productID) {
		String query = "select * from product where id_product = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, productID);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getNString(4), rs.getInt(5),
						rs.getInt(7), rs.getInt(6), rs.getString(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}
	
	public void deleteProductByID(int ID) {
		String queryDelete = "delete from product where id_product = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(queryDelete);
			ps.setLong(1, ID);
			ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void createProduct(Product product) {
		String insertQuery = "insert into product(name_product, price_product, describ, amount, id_manufac, id_category, image) values\r\n"
				+ "(?,?,?,?,?,?,?)";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(insertQuery);
			ps.setString(1, product.getProductName());
			ps.setFloat(2, product.getProductPrice());
			ps.setString(3, product.getDescribe());
			ps.setInt(4,  product.getAmount());
			ps.setInt(5, product.getManufact());
			ps.setInt(6, product.getCategoryID());
			ps.setString(7, product.getImage());
			ps.executeUpdate();	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void updateProductByID(int ID, Product product) {
		String updatedQuery = "update product\r\n"
				+ "set name_product = ?,\r\n"
				+ "price_product = ?,\r\n"
				+ "describ = ?,\r\n"
				+ "amount = ?,\r\n"
				+ "id_manufac = ?,\r\n"
				+ "id_category = ?,\r\n"
				+ "image = ? "
				+ "where id_product = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(updatedQuery);
			ps.setString(1, product.getProductName());
			ps.setFloat(2, product.getProductPrice());
			ps.setString(3, product.getDescribe());
			ps.setInt(4, product.getAmount());
			ps.setInt(5, product.getManufact());
			ps.setInt(6, product.getCategoryID());
			ps.setString(7, product.getImage());
			ps.setInt(8, ID);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		System.out.println(productDAO.getProductByID(1).toString());;
	}
}
