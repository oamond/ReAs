package eg1;

public class Palindrome {
	public static void main(String[] args) {
		String s = "madam";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String s1 = sb.toString();
		if (s.equals(s1)) {
			System.out.println("Yes palindrome");		
		}else {
			System.out.println("No palindrom");
		}
		int num = 101;
		s = num +"";
		System.out.println("s = "+s);
		
		if (new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println("yep");
		}else {
			System.out.println("no");
		}
	}
/*
 * Task - print all palindromes between 1000 and 9999 with the above style
 */
}
