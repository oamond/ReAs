package eg1;

public class Main {
	
	public static void main(String[] args) {
		MobileV2 v2 = new MobileV2();
		System.out.println("accesing V2");
		v2.browsing();
		v2.message();
		System.out.println(v2.hashCode());
		System.out.println(v2.getClass());
	}

}
