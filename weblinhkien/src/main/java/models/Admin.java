package models;

public class Admin {
	private int adminID;
	private String adminName;
	private String adminAcc;
	private String adminPass;
	
	
	
	
	public Admin(int adminID, String adminName, String adminPass, String adminAcc) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
		this.adminAcc = adminAcc;
		this.adminPass = adminPass;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminAcc() {
		return adminAcc;
	}
	public void setAdminAcc(String adminAcc) {
		this.adminAcc = adminAcc;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + ", adminAcc=" + adminAcc + ", adminPass="
				+ adminPass + "]";
	}
	
	
	
}
