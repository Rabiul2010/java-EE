package rabiul.cu.cse;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	//TreeMap order elements according to the ascending order of the key
	public static void main(String[] args) {
		//create a hash map
		Map<String, String> map= new TreeMap<String, String>();
		//put elements to the map
		map.put("10205062","Mohammad Aminul Islam");
		map.put("10205063", "Mohammad Rabiul Islam");
		map.put("09205045","Abdullah Al Mohammad Maruf");
		//print the size of map
		System.out.println("Size of map after addition "+map.size());
		//get elements
		System.out.println("value of '10205062' is:"+map.get("10205062"));
		//get all the values
		System.out.println("All values of map "+map.values());
		
	}

}
