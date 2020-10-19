import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		/*Set don't have repeated numbers
		 * Elements are in array
		 * each elements has an associated hash code that is used to determinate the index of the array
		 * Adding and finding element is Big O notation O(1), doesn't matter how many elements contains the array
		 * Elements are inserted in ArrayLists
		 * if the bucket is too full we need to resize. the buckets is reference of the principal linketlist
		 * 
		 */
		HashSet<String> myHashSet =  new HashSet<String>();
		myHashSet.add("Hello");
		myHashSet.add("World");
		myHashSet.add("awesome");
		System.out.println(myHashSet);
		//DATA STRUCTURE LIKE DICTIONARIES IN PYTHON IS MAP
		String evaluate = "this is my string to is evaluate this";
		HashMap<String, Integer> appearances = new HashMap<String, Integer>();
		String[] separateEvaluate = evaluate.split(" ");
		int count = 0;
		for(String val : separateEvaluate) {
			if(!appearances.containsKey(val)) {
				appearances.put(val, 1);
			} else {
				count = appearances.get(val)+1;
				appearances.put(val, count);
			}
		}
		System.out.println(appearances);
		//iterating the map
		//first way
		Set<String> keys = appearances.keySet();
		for(String word : keys) {
			System.out.println(word + " = " + appearances.get(word));
		}
		//second way
		for(Map.Entry<String, Integer> value : appearances.entrySet()) {
			System.out.println(value.getKey() +" = "+value.getValue() );
		}
	}

}
