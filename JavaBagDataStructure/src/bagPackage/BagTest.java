package bagPackage;

public class BagTest {

	public static void main(String[] args) {
		
		//Creates an instance of the bag class using string values
		Bag<String> groceryBag = new Bag<>();
		
		//Adds several elements to the bag including duplicates "Apple" and "Banana"
		groceryBag.add("Apple");
		groceryBag.add("Banana");
		groceryBag.add("Apple");
		groceryBag.add("Orange");
		groceryBag.add("Banana");
		groceryBag.add("Apple");
		
		//Prints the original bag.
		System.out.println("Original bag:");
		groceryBag.printBag();
		
		//Test the contains method.
		System.out.println("Contains Apple? " + groceryBag.contains("Apple"));
		System.out.println("Contains Grapes? " + groceryBag.contains("Grapes"));
		System.out.println("Contains Orange? " + groceryBag.contains("Orange"));
		
		//Tests the count method.
		System.out.println("Count Apple: " + groceryBag.count("Apple"));
		System.out.println("Count Banana: "+ groceryBag.count("Banana"));
		System.out.println("Count Grapes: "+ groceryBag.count("Grapes"));
		
		//Removes one apple.
		System.out.println("\nRemoving one Apple.");
		groceryBag.remove("Apple");
		
		//checks the bag after removing one apple.
		System.out.println("\nBag after removing one Apple:");
		groceryBag.printBag();
		
		//checks the contains method after removing one apple and also tests the count method.
		System.out.println("\nContains Apple after removal? " + groceryBag.contains("Apple"));
		System.out.println("Count Apples after removal: "+ groceryBag.count("Apple"));
		
		//Removes the only instance of orange.
		System.out.println("\nRemoving Orange.");
		groceryBag.remove("Orange");
		
		//Checks the bag after the removal of orange.
		System.out.println("\nBag after removing one Orange: ");
		groceryBag.printBag();
		//Checks the contains and count methods after removing the orange.
		System.out.println("\nContains Orange after removal? " + groceryBag.contains("Orange"));
		System.out.println("Count Orange after removal: "+ groceryBag.count("Orange"));
			
	}

}
