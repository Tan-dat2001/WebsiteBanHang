 package models;

import java.sql.Date;

public class Order {
	private int orderID;
	private int userID;
	private Date orderDate;
	private Float totalMoney;
	
	public Order() {
		
	}
	
	public Order(int orderID, int userID, Date orderDate, Float totalMoney) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderDate = orderDate;
		this.totalMoney = totalMoney;
	}
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Float getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", userID=" + userID + ", orderDate=" + orderDate + ", totalMoney="
				+ totalMoney + "]";
	}
	
}
