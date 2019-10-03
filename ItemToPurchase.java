public class ItemToPurchase {
	protected String name;
	protected String description;
	protected int price;
	protected int quantity;
	
	public ItemToPurchase() {	//Default constructor
		name = "none";
		description = "none";
		price = 0;
		quantity = 0;
	}
	
	public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
		this.name = itemName;
		this.description = itemDescription;
		this.price = itemPrice;
		this.quantity = itemQuantity;
	}
	
	public void setName(String itemName) {
		this.name = itemName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription (String itemDescription) {
		this.description = itemDescription;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(int itemPrice) {
		this.price = itemPrice;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setQuantity(int itemQuantity) {
		this.quantity = itemQuantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void printItemCost() {
		System.out.println(name + " " + quantity + " @ $" + price + " = $" + (quantity * price));
	}
	public void printItemDescription() {
		System.out.println(name + ": " + description);
	}
}