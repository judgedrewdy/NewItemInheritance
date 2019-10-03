import java.util.Scanner;

public class ShoppingCartManager {
	public static void printMenu(ShoppingCart cart) {
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("m - Add expiring item to cart");
		System.out.println("s - Output expiring item's fields");
		System.out.println("q - Quit\n");
		System.out.println("Choose an option:");
	}
	public static void main(String[] args) {
		String name;
		String date;
	
		Scanner scnr = new Scanner(System.in);
	
		System.out.println("Enter Customer's name:");
		name = scnr.nextLine();
		System.out.println("Enter Today's Date:");
		date = scnr.nextLine();
	
		ShoppingCart cart = new ShoppingCart(name, date);
	
		System.out.println("Customer Name: " + cart.getCustomerName());
		System.out.println("Today's Date: " + cart.getDate());
	
//		ItemToPurchase item1 = new ItemToPurchase("Chocolate Chips", "Semi-Sweet", 3, 5); 
//		ItemToPurchase item2 = new ItemToPurchase("Nike Romaleos", "Volt color, Weightlifting shoes", 189, 2);
//		ItemToPurchase item3 = new ItemToPurchase("Powerbeats 2 Headphones", "Bluetooth headphones", 128, 1);
//		ItemToPurchase item4 = new ItemToPurchase("Chocolate Chips", "Semi-Sweet", 3, 10);
//	
//	
//		cart.addItem(item1);
//		cart.addItem(item2);
//		cart.addItem(item3);
		//cart.removeItem("Powerbeats 2 Headphones"); remove item test
	
		//cart.modifyItem(item4);  //modify item test
		//System.out.println(cart.getNumItemsInCart()); //getnumItems test
		//cart.printTotal();
		String userInput = " ";
		printMenu(cart);
		
		
		while (!userInput.equals("q")) {
			
			userInput = scnr.nextLine();
			
			if (userInput.equals("q")) {
				break;
			}
			else if (userInput.equals("o")) {
				System.out.println("OUTPUT SHOPPING CART");
				cart.printTotal();
				printMenu(cart);
			}
			else if (userInput.equals("i")) {
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				cart.printDescriptions();
				printMenu(cart);
			}
			else if (userInput.equals("a")) {
				System.out.println("ADD ITEM TO CART");
				System.out.println("Enter the item name:");
				String newItemName = scnr.nextLine();
				
				System.out.println("Enter the item description:");
				String newItemDescription = scnr.nextLine();
				
				System.out.println("Enter the item price:");
				int newItemPrice = scnr.nextInt();
				
				scnr.nextLine();
				System.out.println("Enter the item quantity:");
				int newItemQuantity = scnr.nextInt();
				scnr.nextLine();
				
				ItemToPurchase newItem = new ItemToPurchase(newItemName, newItemDescription, newItemPrice, newItemQuantity);
				cart.addItem(newItem);
				printMenu(cart);
				//cart.printTotal();
			}
			else if (userInput.equals("d")) {
				System.out.println("REMOVE ITEM FROM CART");
				System.out.println("Enter name of item to remove:");
				String itemToRemove = scnr.nextLine();
				cart.removeItem(itemToRemove);
				printMenu(cart);
			}
			else if(userInput.equals("c")) {
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name:");
				String itemToBeChanged = scnr.nextLine();
				System.out.println("Enter the new quantity:");
				int newItemQuantity = scnr.nextInt();
				scnr.nextLine();
				ItemToPurchase modifiedItem = new ItemToPurchase(itemToBeChanged, " ", 0, newItemQuantity);
				
				
				cart.modifyItem(modifiedItem);
				printMenu(cart);
			}
			else if (userInput.equals("m")) {
				System.out.println("ADD ITEM TO CART");
				System.out.println("Enter the item name:");
				String newItemName = scnr.nextLine();
				
				System.out.println("Enter the item description:");
				String newItemDescription = scnr.nextLine();
				
				System.out.println("Enter the item price:");
				int newItemPrice = scnr.nextInt();
				
				scnr.nextLine();
				System.out.println("Enter the item quantity:");
				int newItemQuantity = scnr.nextInt();
				scnr.nextLine();
				
				System.out.println("Enter the item's expiration date:");
				String newItemExpirationDate = scnr.nextLine();
				
				System.out.println("Enter the item's weight:");
				double newItemWeight = scnr.nextDouble();
				scnr.nextLine();
				
				MyInheritedItem newItem = new MyInheritedItem(newItemName, newItemDescription, newItemPrice, newItemQuantity, newItemExpirationDate, newItemWeight);
				cart.addItem(newItem);
				printMenu(cart);
			}
			else if (userInput.equals("s")) {
				cart.printInheritedItem();
			}
			else {
				System.out.println("Choose an option:");
			}
		}
	
	}
}
