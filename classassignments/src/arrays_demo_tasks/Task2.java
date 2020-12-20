package arrays_demo_tasks;
/*
 * 2)Delete specific element from an array
 */

public class Task2 {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("ar[] before replacing :\n");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+ " ");
			
				
			}
		ar[3]= 0;
		System.out.println("\nafter replacing the ar[3] = 0, or fourth element :\n");
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j]+ " ");	
			
		}
		
		
		
	}

}
