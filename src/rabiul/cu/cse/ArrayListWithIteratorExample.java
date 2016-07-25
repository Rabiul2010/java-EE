package rabiul.cu.cse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithIteratorExample {
	public static void main(String[] args) {
		// create a list
		List<String> list = new ArrayList<String>();
		System.out.println("initial size of list: " + list.size());

		// add element to the list
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println("size of the list after addition: " + list.size());

		// display all the content using iterator
		System.out.println("contents of list");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(" " + iterator.next());

		}
		// display all the contents using for-each
		System.out.println("\ncontents of list");
		for (String string : list) {
			System.out.print(" " + string);

		}
	}

}
