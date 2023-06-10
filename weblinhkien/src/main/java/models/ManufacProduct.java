package models;

public class ManufacProduct {
	private int manufacProductID;
	private String manufacName;
	
	public ManufacProduct(int manufacProductID, String manufacName) {
		super();
		this.manufacProductID = manufacProductID;
		this.manufacName = manufacName;
	}

	public int getManufacProductID() {
		return manufacProductID;
	}

	public void setManufacProductID(int manufacProductID) {
		this.manufacProductID = manufacProductID;
	}

	public String getManufacName() {
		return manufacName;
	}

	public void setManufacName(String manufacName) {
		this.manufacName = manufacName;
	}

	@Override
	public String toString() {
		return "ManufacProduct [manufacProductID=" + manufacProductID + ", manufacName=" + manufacName + "]";
	}

}
