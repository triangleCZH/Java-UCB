public class BooleanSet implements SimpleSet {

	// Represent a set of nonnegative ints from 0 to maxElement-1
	// for some initially specified maxElement. 
	
	// contains[k] is true if k is in the set, false if it isn't
	private boolean[] contains;
	
	// Initialize a set of ints from 0 to maxElement-1.
	public BooleanSet (int maxElement) {
		contains = new boolean[maxElement];
	    for(int i = 0; i<maxElement; i++){
			contains[i] = false;
		}
	}
	
	// precondition: 0 <= k < maxElement.
	// postcondition: k is in this set.
	public void add(int k) {
		contains[k] = true;
	}
	
	// precondition: 0 <= k < maxElement.
	// postcondition: k is not in this set.
	public void remove(int k) {
		contains[k] = false;
	}
	
	// precondition: 0 <= k < maxElement
	// Return true if k is in this set, false otherwise.
	public boolean contains (int k) {
		return contains[k];
	}
	
	// Return true if this set is empty, false otherwise.
	public boolean isEmpty() {
		boolean empty = true;
		for(int i = 0; i < contains.length && empty; i++) {
			if (contains[i]) {
				empty = false;
			}
		}
		return empty;
	}

	// Returns the number of items in the set
	public int size() {
		int count = 0;
		for (int i = 0;i < contains.length;i++) {
			if (contains[i]) {
				count++;
			}
		}
		return count;
	}
}