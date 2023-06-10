package models;

public class OrderDetail {
	private int detailID;
	private int orderID;
	private int productID;
	private int amount;
	private Float price;
	private Float totalPrice;
	
	 
	
	
	public OrderDetail(int detailID, int orderID, int productID, int amount, Float price, Float totalPrice) {
		super();
		this.detailID = detailID;
		this.orderID = orderID;
		this.productID = productID;
		this.amount = amount;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	
	public int getDetailID() {
		return detailID;
	}
	public void setDetailID(int detailID) {
		this.detailID = detailID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "OrderDetail [detailID=" + detailID + ", orderID=" + orderID + ", productID=" + productID + ", amount="
				+ amount + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}
	
}
