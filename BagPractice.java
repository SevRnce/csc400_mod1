import java.util.ArrayList;

public class BagPractice<T> {
	private ArrayList<T> items;
	//items items and bag size
	
	public BagPractice() {
		items = new ArrayList<>();
		//define initial bag
	}
	
	public void add(T item) {
		items.add(item);
		//adding items
	}
	
	public boolean remove(T item) {
		return items.remove(item);
	}
	
	public boolean contains(T item) {
		return items.contains(item);
	}
	
	public int count(T item) {
		int counts = 0;
		for (T currentItem : items) {
			if (currentItem.equals(item)) {
				counts++;
			}
		}
		return counts;
	}
	
	public void print() {
		System.out.println(items);
	}
	
	public static void main(String[] args) {
		BagPractice<String> bag = new BagPractice<>();
		
		bag.add("a");
		bag.add("b");
		bag.add("c");
		bag.add("b");
		
		System.out.println("Contents: ");
		bag.print();
		System.out.println("Does the bag contain 'b'? " + bag.contains("b"));
		System.out.println("'b' appears " + bag.count("b") + " times.");
		System.out.println("Removing one occurance of 'b'.");
		bag.remove("b");
		System.out.println("Contents: ");
		bag.print();
		System.out.println("Does the bag contain 'b'? " + bag.contains("b"));
		System.out.println("'b' appears " + bag.count("b") + " times.");
		System.out.println("Removing one occurance of 'a'.");
		bag.remove("a");
		System.out.println("Contents: ");
		bag.print();
		System.out.println("Does the bag contain 'a'? " + bag.contains("a"));
		System.out.println("'a' appears " + bag.count("a") + " times.");
	}

}