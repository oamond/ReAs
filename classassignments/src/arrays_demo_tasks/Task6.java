package arrays_demo_tasks;

public class Task6 {
	
//	 *6)Find all Palindrome numbers in an array 
//    Task  - Print all palindromes between 1000 and 9999
	
	public static void main(String[] args) {
		
		System.out.println("Palindromes in arr1[]");
		int arr1[] = { 121, 242, 565, 233, 562, 834, 802, 345, 246, 589, 594, 785, 243, 843};
				
			System.out.println(arr1[+isPalindrome(arr1)+]);
			
			}
	public static boolean isPalindrome(int[] arr1 ) {
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr1[arr1.length-1-i]) {
				return false;
				
			}
		}
			return true;
	}
}
	

