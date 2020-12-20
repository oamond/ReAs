package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArrayread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of elements");
		int n = sc.nextInt();
		System.out.println("Enter 4"+n+" elements");
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(ar));
		
		sc.close();
	}

}
