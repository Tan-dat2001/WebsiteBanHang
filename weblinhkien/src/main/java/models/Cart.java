package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> items;

	public Cart() {
		items = new ArrayList<>();
	}
	
	
	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	public Cart (List<Item> items) {
		this.items = items;
	}
	private Item getItemById(int productID) {
		for(Item i:items) {
			if(i.getProduct().getProductID()==productID) {
				return i;
			}
		}
		
		return null;
	}
	
	public int getQuantityById(int productID) {
		return getItemById(productID).getQuantity();
	}
	
	public void addItem(Item t) {
		//có ở cart rồi
		if(getItemById(t.getProduct().getProductID()) != null) {
			Item m = getItemById(t.getProduct().getProductID());
			m.setQuantity(m.getQuantity()+t.getQuantity());	
		}else {
			items.add(t);
		}
	}
	
	public void removeItem(int productID) {
		if(getItemById(productID)!=null) {
			items.remove(getItemById(productID));
		}
	}
	
	public double getTotalMoney(){
		double t = 0;
		for(Item i: items) {
			t+=	i.getQuantity()*i.getPrice();
		}
		return t;
	}
	
	private Product getProductByID(int productID, List<Product>list) {
		for(Product i: list) {
			if(i.getProductID()==productID) {
				return i;
			}
		}
		return null;
	}
	
	public Cart(String txt, List<Product> list) {
		items = new ArrayList<>();
		try {
			if(txt != null && txt.length()!=0) {
				String[] s = txt.split("\\-");
				for(String i: s) {
					String [] n = i.split("\\:");
					int id = Integer.parseInt(n[0]);
					//System.out.println("ProductId = " + id);
					int quantity = Integer.parseInt(n[1]);
					//System.out.println("Quantity Product = " + quantity);
					Product product = getProductByID(id,list);
					double price = product.getProductPrice();
					Item t = new Item(product,quantity,price);
					addItem(t);
					
				}
			}
			
		}catch(NumberFormatException e) {
			
			
		}
	}


	
}
