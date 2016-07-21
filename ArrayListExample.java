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
		
	}

}
