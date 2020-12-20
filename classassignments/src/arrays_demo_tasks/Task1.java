package arrays_demo_tasks;
//Tasks
/*
*1)Print the array in reverse order
*2)Delete specific element from an array
*3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
*4)Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
*5)Find the minimum and the maximum element in an array
*6)Find all Palindrome numbers in an array 
*/
public class Task1 {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		
		
			System.out.println("Elements in ar[] :\n");
			for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]+" ");
			}
			System.out.println("\nElements in ar[] reversed :\n");
			for (int i = ar.length-1; i >= 0; i--) { // looping through the array in reverse.
				System.out.println(ar[i]+" ");
				
			}
			
	}
			
}
