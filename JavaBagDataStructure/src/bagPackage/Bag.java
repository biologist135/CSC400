package bagPackage;

public class Bag<T> {
	private Object[] bagArray;
	
	//Constructor creates an empty bag
	public Bag() {
		bagArray = new Object[0];
		
	}
	// Adds an item to the bag by creating a new array that is one space larger.
	public void add(T item) {
		if(item == null) {
			return;
		}
		Object[] tempArray = new Object[bagArray.length + 1];
		
		//Copies all current items into the temporary array.
		for (int i = 0; i < bagArray.length; i++) {
			tempArray[i] = bagArray[i];
		}
		
		//Adds the new item to the array at the end.
		tempArray[tempArray.length - 1] = item;
		
		//Replaces the old array with the new array.
		bagArray = tempArray;
	}
	
	//Removes one occurrence of the item from the bag, if it exists.
	public void remove (T item) {
		//Only attempts to remove the item if it exists
		if (contains(item)) {
			Object[] tempArray = new Object[bagArray.length -1];
			int currIndex = 0;
			boolean removed = false;
			
			//Copy every item except the first matching item
			for (int i = 0; i < bagArray.length; i++) {
				if(!removed && bagArray[i].equals(item)) {
					removed = true;
				}
				else {
					tempArray[currIndex] = bagArray[i];
					currIndex++;
				}
			}
			//Replaces the old array with the new array.
			bagArray = tempArray;
		}
	}
	
	//Returns true if the item exists in the bag.
	public boolean contains(T item) {
		for (int i = 0; i < bagArray.length; i++) {
			if (bagArray[i].equals(item)){
				return true;
			}
		}
		return false;
	}
	
	//Counts how many times the specific item appear in the bag.
	public int count(T item) {
		int total = 0;
		
		for(int i = 0; i< bagArray.length;i++) {
			if(bagArray[i].equals(item)) {
				total ++;
			}
		}
		return total;
	}
	
	//Prints the contents of the bag.
	public void printBag() {
		System.out.println("The bag contains: ");
		
		for(int i = 0; i < bagArray.length; i++) {
			System.out.println(bagArray[i] + " "