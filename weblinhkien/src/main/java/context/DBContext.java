package context;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.enterprise.inject.New;

public class DBContext {
	   
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://"+serverName+":"+portNumber+"/"+databaseName+instance;
		if (instance == null || instance.trim().isEmpty()){
			url = "jdbc:mysql://"+serverName+":"+portNumber+"/"+databaseName;
		}
		return DriverManager.getConnection(url, userID, password);
		
	}
	private final String serverName = "localhost";
	private final String portNumber = "3306";
	private final String databaseName = "electronic_components";
	private final String userID = "root";
	private final String password ="280412092312"; 
	private final String instance = "?serverTimezone=UTC";
	
	public static void main(String args[]){
		try {
			System.out.println(new DBContext().getConnection());
		} catch (Exception e) {
			
		}
	}
}
