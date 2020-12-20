
public class ReverseOrder {

	public static void main(String[] args) {
		String cities[] = {"Houston","Dallas","Los Angeles","New York", "Orlando", "Philadelphia"};
		/*Reverse the order in the array below*/
			for (int i = 0 ;  i < cities.length/2 ; i++) {
				String city = cities[i];
				
				cities[i] = cities[cities.length-1-i];
				cities[cities.length-1-i] = city;
				}
			//Print the result 
			for (int i1 = 0; i1 < cities.length; i1++) {
				System.out.println(cities[i1]);
		
		}
	}

}
