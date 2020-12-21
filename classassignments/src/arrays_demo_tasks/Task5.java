package arrays_demo_tasks;

import java.util.Arrays;

public class Task5 {
	//*5)Find the minimum and the maximum element in an array
	public static void main(String[] args) {
		
		int arr[]= {12, 24, 53, 56, 49, 89, 30, 12, 92};
		Arrays.sort(arr);
		 System.out.println("minimum : "+ arr[0]);
		 System.out.println("maximum : "+ arr[arr.length-1]);
			
		}
		
	}



