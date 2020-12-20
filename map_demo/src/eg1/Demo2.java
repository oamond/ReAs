package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*
 * Enumerator - read operation from top to bottom
 * Iterator - read and remove operation from top to bottom (Any collection)
 * ListIterator - read, remove and add from any direction but it is only used with List interface. 
 */
public class Demo2 {

	
	public static void main(String[] args) {
	Map <Integer, String> hm1 = new HashMap<>();
	hm1.put(100, "Java"); //insert	
	hm1.put(100, "openjdk"); //update
	hm1.put(199, "Java");
	hm1.put(300, "Java");
	hm1.put(900, null);
	hm1.put(1000, null);
	hm1.put(22, "Java");
//	hm1.put(null, "Java");
	hm1.put(45, null);
	hm1.put(800, "asda ");
	hm1.put(500, "Jwesfa");
	hm1.put(400, "Java");
	System.out.println("hm1 = "+hm1);
	
	//for(Entry<Integer, String> e : hm1.entrySet()) {
	//	if (e.getValue()==null || e.getKey()%10==0) {
	//		hm1.remove(e.getKey());
//		}
//	}
	System.out.println("\niterating using iterator\n");
	Iterator<Entry<Integer, String>> i = hm1.entrySet().iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
