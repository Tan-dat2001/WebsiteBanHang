package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import models.Admin;
import models.User;

public class UserDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<User> getAllUser(){
		List<User> list = new ArrayList<>();
		String query = "select * from user";
	
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new User(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getString(6),
						rs.getString(7)));
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
		public User getUserAccount(String name, String pass) {
			List<User> list = this.getAllUser();
			for (User user : list) {
				if (user.getUserAcc().equals(name) && user.getPassword().equals(pass)){
					return user;
				}
			}
			return null;
		}
		
		public User existsAccount(String name) {
			String queryFind = "select * from user where name_account = ?";
			try {
				conn = new DBContext().getConnection();
				ps = conn.prepareStatement(queryFind);
				ps.setString(1, name);
				rs = ps.executeQuery();
				
				while (rs.next()) {
					User userr = new User(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getDate(5),
							rs.getString(6),
							rs.getString(7));
					return userr;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}
		
		public User getUserByID(int ID) {
			String queryFind = "select * from user where id_user = ?";
			try {
				conn = new DBContext().getConnection();
				ps = conn.prepareStatement(queryFind);
				ps.setLong(1, ID);
				rs = ps.executeQuery();
				
				while (rs.next()) {
					User userr = new User(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getDate(5),
							rs.getString(6),
							rs.getString(7));
					return userr;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}
		
		public void createUserAccount(User user) {
			String insertQuery = "insert into user (name_user, password_user, name_account, date_of_birth, address, phone) \r\n"
					+ "values (?,?,?,?,?,?)";
			try {
				conn = new DBContext().getConnection();
				ps = conn.prepareStatement(insertQuery);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getUserAcc());
				ps.setDate(4, user.getDateOfBirth());
				ps.setString(5, user.getAdress());
				ps.setString(6, user.getPhone());
				ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void deletedUserByID(int ID) {
			String queryDelete = "delete from user where id_user = ?";
			try {
				conn = new DBContext().getConnection();
				ps = conn.prepareStatement(queryDelete);
				ps.setLong(1, ID);
				ps.execute();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void updateUserByID(int ID, User user) {
			String queryUpdate = "update user\r\n"
					+ "set name_user = ?,\r\n"
					+ "date_of_birth = ?,\r\n"
					+ "address = ? ,\r\n"
					+ "phone = ?\r\n"
					+ "where id_user = ?";
			try {
				conn = new DBContext().getConnection();
				ps = conn.prepareStatement(queryUpdate);
				ps.setString(1, user.getUserName());
				ps.setDate(2, user.getDateOfBirth());
				ps.setString(3, user.getAdress());
				ps.setString(4, user.getPhone());
				ps.setLong(5, ID);
				ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public static void main(String[] args) {
			System.out.println(new UserDAO().getUserByID(7).toString());
		}	
}
	


