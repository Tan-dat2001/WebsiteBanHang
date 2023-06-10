package models;

public class CategoryProduct {
	private int categoryProductID;
	private String categoryName;
	public CategoryProduct(int categoryProductID, String categoryName) {
		super();
		this.categoryProductID = categoryProductID;
		this.categoryName = categoryName;
	}

	public int getCategoryProductID() {
		return categoryProductID;
	}

	public void setCategoryProductID(int categoryProductID) {
		this.categoryProductID = categoryProductID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryProduct [categoryProductID=" + categoryProductID + ", categoryName=" + categoryName + "]";
	}
}
