package eg1;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		sb1.append(" hey").append(1233).append(123.5555).append('c');
		System.out.println(sb1);
		
		sb1.insert(1, "JAVA");
		System.out.println(sb1);
		sb1.delete(1, 4);
		System.out.println(sb1);
		
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		System.out.println(sb1.length());
		
		StringBuffer sb2 = new StringBuffer("java");
		StringBuffer sb3 = new StringBuffer("java");
		
		
		System.out.println(sb2.equals(sb3)); // compares addresses because equals is not available in bffer or builder
											// classes, so by default equals from object will compare addresses same
											// was as ==
		System.out.println();
		
		
	}

}
