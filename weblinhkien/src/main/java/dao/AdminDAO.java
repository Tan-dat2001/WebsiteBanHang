package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import models.Admin;
import models.User;

public class AdminDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Admin> getAllAdmin(){
		List<Admin> list = new ArrayList<>();
		String query = "select * from admin";
	
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Admin(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)));
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public Admin getAdminAccount(String name, String pass) {
		List<Admin> list = this.getAllAdmin();
		for (Admin admin : list) {
			if (admin.getAdminAcc().equals(name) && admin.getAdminPass().equals(pass)){
				return admin;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		AdminDAO admin = new AdminDAO();
		Admin adm = admin.getAdminAccount("HoaNT", "23456");
		System.out.println(adm.getAdminName());
	}
}
