
public class SwapElements {

	public static void main(String[] args) {
		int[] elements = {1,2,3,4,5};
		int temp = elements[0];
		elements[0] = elements[elements.length-1];
		elements[elements.length-1] = temp;
		int i = 0; 
		i = elements.length ; ++i;

		System.out.println("First element: " + elements[0]);
		System.out.println("Last element: " + elements[4]);
	}

}
