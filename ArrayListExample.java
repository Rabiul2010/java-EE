import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
	public static void main(String[] args) {
		//create a lis
		List<String> list= new ArrayList<String>();
		System.out.println("intial size of list "+list.size());
		
		//add elements to the array list
		list.add("R");
		list.add("A");
		list.add("B");
		list.add("I");
		list.add("U");
		list.add("L");
		System.out.println("size of list after additions "+list.size());
		
		//display all elements
		System.out.println("elements of list "+list);
		
		//display the first element of array list
		System.out.println("first element of array list "+list.get(0));
		
		//remove elements from array list
		list.remove(0);
		System.out.println("size of list after deletions "+list.size());
		System.out.println("content of list "+list);
		
		//search elements
		System.out.println("Does list contain 'A' "+list.contains("A"));
		System.out.println("Does list contain 'R' "+list.contains("R"));
	}

}
