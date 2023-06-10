package models;

public class Product {
	private int productID;
	private String productName;
	private Float productPrice;
	private String describe;
	private int amount;
	private int manufact;
	private int categoryID;
	private String image;
	
	public Product() {
		
	}
	
	
	public Product(int productID, String productName, Float productPrice, String describe, int amount, int manufact,
			int categoryID, String image) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.describe = describe;
		this.amount = amount;
		this.manufact = manufact;
		this.categoryID = categoryID;
		this.image = image;
	}
	
	
	public Product(int productID, String productName, Float productPrice, int amount) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.amount = amount;
	}


	public int getManufact() {
		return manufact;
	}

	public void setManufact(int manufact) {
		this.manufact = manufact;
	}


	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", describe=" + describe + ", amount=" + amount + ", manufact=" + manufact + ", categoryID="
				+ categoryID + ", image=" + image + "]";
	}
	
}
