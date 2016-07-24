package dimikcomputing_java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		//create a hash map
		Map<String, String> map= new HashMap<String, String>();
		//put elements to the map
		map.put("10205062","Mohammad Aminul Islam");
		map.put("10205063", "Mohammad Rabiul Islam");
		map.put("09205045","Abdullah Al Mohammad Maruf");
		//print the size of map
		System.out.println("Size of map after addition "+map.size());
		//get elements
		System.out.println("What is after "10205062":"+map.get("10205062"));
		//get all the values
		System.out.println("All values of map "+map.values());
		
	}

}
