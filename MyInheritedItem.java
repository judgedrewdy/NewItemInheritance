public class MyInheritedItem extends ItemToPurchase {
	private String expirationDate;
	private double weight;
	
	public MyInheritedItem() {
		super();
		expirationDate = "January 1, 1900";
		weight = 0.0;
	}
	
	public MyInheritedItem(String name, String description, int price, int quantity, String expirationDate, double weight) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.expirationDate = expirationDate;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + " " + description + " " + price + " " + quantity + " " + expirationDate + " " + weight;
	}
}