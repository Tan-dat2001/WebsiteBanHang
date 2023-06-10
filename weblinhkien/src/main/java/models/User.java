package models;

import java.sql.Date;

public class User {
	private int userID;
	private String userName;
	private String userAcc;
	private String password;
	private Date dateOfBirth;
	private String adress;
	private String phone;
	
	
	
	
	public User(int userID, String userName, String password, String userAcc, Date dateOfBirth, String adress,
			String phone) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userAcc = userAcc;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.adress = adress;
		this.phone = phone;
	}
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAcc() {
		return userAcc;
	}
	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userAcc=" + userAcc + ", password=" + password
				+ ", dateOfBirth=" + dateOfBirth + ", adress=" + adress + ", phone=" + phone + "]";
	}

	
}
	
