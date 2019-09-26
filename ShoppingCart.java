import java.util.ArrayList;

public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
	
	public ShoppingCart() {
		customerName = "none";
		currentDate = "January 1, 2016";
	}
	
	public ShoppingCart(String customerName, String currentDate) {
		this.customerName = customerName;
		this.currentDate = currentDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getDate() {
		return currentDate;
	}
	
	public void addItem(ItemToPurchase item) {
		cartItems.add(item);
	}
	
	public void removeItem(String itemName) {
		int i;
		boolean found = false;
		
		for(i = 0; i < cartItems.size() && !found; i++) {
			if (cartItems.get(i).getName().equals(itemName)) {
				cartItems.remove(i);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}
	
	public void modifyItem(ItemToPurchase item) {
		int i;
		boolean found = false;
		
		for(i = 0; i < cartItems.size() && !found; i++) {
			if(item.getName().equals(cartItems.get(i).getName())) {
				//cartItems.get(i).setDescription(item.getDescription());
				//cartItems.get(i).setPrice(item.getPrice());
				cartItems.get(i).setQuantity(item.getQuantity());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Item not found in cart.  Nothing modified.");
		}
	}
	
	public int getNumItemsInCart() {
		int i;
		int itemTotal = 0;
		for(i = 0; i < cartItems.size(); i ++) {
			itemTotal += cartItems.get(i).getQuantity();
		}
		return itemTotal;
	}
	
	public int getCostOfCart() {
		int i;
		int totalCost = 0;
		for(i = 0; i < cartItems.size(); i ++) {
			totalCost += cartItems.get(i).getQuantity() * cartItems.get(i).getPrice();
		}
		return totalCost;
	}
	
	public void printTotal() {
		System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
		System.out.println("Number of Items: " + getNumItemsInCart() + "\n");
		if (cartItems.size() == 0) {
			System.out.println("SHOPPING CART IS EMPTY");
		}
		else {
			for(int i = 0; i < cartItems.size(); i++) {
				cartItems.get(i).printItemCost();
			}
		}
		System.out.println("\nTotal: $" + getCostOfCart());
	}
	
	public void printDescriptions() {
		System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
		System.out.println("\nItem Descriptions");
		for(int i = 0; i < cartItems.size(); i++) {
			cartItems.get(i).printItemDescription();
		}
	}
}
