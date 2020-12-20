package regex_pack;

public class MobileNumbervalidation {

	public static void main(String[] args) {
		String s = "+1-2345678910";
		if(s.matches("\\+1-[0-9]{10}")) {
			System.out.println("valid mobile number");
		}else {
			System.out.println("invalid mobile number");
		}
	}
}
