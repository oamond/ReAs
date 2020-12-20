package regex_pack;

public class RegexDemo1 {

	public static void main(String[] args) {

/*
 * Reg-Ex - regular expression
 * short hand of writing an expression usnig some wild cards, which would match the pattern and give the results
 * [] - to write an expression
 * {} - represents length
 * ^ - not
 * [0-9]{5} - any five digits of length 5
 * [a-zA-Z]{6}- any word of length 6
 * [a-zA-Z0-9]{2,6} - any alphanumeric of min length 2 and max length 6
 * [A-Z] {1,} - min 1 uppercase letter and max can be any
 * 
 * [^A-Z]- apart from lowercase letters anything else is accepted
 */
		
		String ex = "ABIDE12340";
		
		if (ex.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.err.println("validated");
			
		}else {
			System.out.println("failed");
	}
	}

}
