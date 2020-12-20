package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {

		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "Java"); //insert	
		hm.put(100, "openjdk"); //update
		hm.put(199, "Java");
		hm.put(300, "Java");
		//hm.put(900, null);
	//	hm.put(1000, null);
		hm.put(22, "Java");
	//	hm.put(null, "Java");
		// hm.put(45, null);
		hm.put(800, "asda ");
		hm.put(500, "Jwesfa");
		hm.put(400, "Java");
		System.out.println("hm = "+hm);
		
		Map<Integer, String> hm1 = new LinkedHashMap<>();
		hm1.put(100, "Java"); //insert	
		hm1.put(100, "openjdk"); //update
		hm1.put(199, "Java");
		hm1.put(300, "Java");
		hm1.put(900, null);
		hm1.put(1000, null);
		hm1.put(22, "Java");
		hm1.put(null, "Java");
		hm1.put(45, null);
		hm1.put(800, "asda ");
		hm1.put(500, "Jwesfa");
		hm1.put(400, "Java");
		System.out.println("hm1 = "+hm1);
		
		Map<Integer, String> hm2 = new TreeMap<>(Collections.reverseOrder());
		hm2.put(100, "Java"); //insert	
		hm2.put(100, "openjdk"); //update
		hm2.put(199, "Java");
		hm2.put(300, "Java");
		hm2.put(900, null);
		hm2.put(1000, null);
		hm2.put(22, "Java");
		//hm2.put(null, "Java");
		hm2.put(45, null);
		hm2.put(800, "asda ");
		hm2.put(500, "Jwesfa");
		hm2.put(400, "Java");
		System.out.println("hm2 = "+hm2);
		
		Map<Integer, String> hm3 = new Hashtable<>();
		hm3.put(100, "Java"); //insert	
		hm3.put(1, "openjdk"); //update
		hm3.put(199, "Java");
		hm3.put(300, "Java");
	//	hm3.put(900, null);
	//	hm3.put(1000, null);
		hm3.put(22, "Java");
	//	hm3.put(null, "Java");
	//	hm3.put(45, null);
		hm3.put(800, "asda ");
		hm3.put(50234210, "Jwesfa");
		hm3.put(40324230, "Java");
		System.out.println("hm3 = "+hm3);
		
		System.out.println("hm3.containsKey(100) :"+ hm3.containsKey(100));
		
		System.out.println(hm3.keySet());
		System.out.println(hm3.values());
		
		Set<Integer> hs = hm.keySet();
		System.out.println("\nIterating using KeySet()");
		for (Integer i:hs) {
			System.out.println("Key : "+i+"Value : "+hm3.get(i));
		}
	}
	

}
