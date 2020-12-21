package arrays_demo_tasks;

public class Task4 {
	
	public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
       System.out.println("Even numbers and their max sum");
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % 2 == 0) {
        		
        		int element1 = arr[i];
        		
        		System.out.println((element1)+i);
        		
        	} else {
        		
        	}
  
        	}
        System.out.println("odd numbers and their max sum");
        for (int j = 0; j < arr.length; j++) {
        	if( arr[j] % 2 != 0) {
        		
        		int element2 = arr[j];
        		
        		
        		System.out.println((element2)+j);
			
		} else {
			
		}
        
        		
   
        	
        	
			
		}
		
	}

}
