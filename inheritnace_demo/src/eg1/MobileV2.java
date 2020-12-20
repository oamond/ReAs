package eg1;

public class MobileV2 extends MobileV1 {
	public void browsing() {
		System.out.println("Browsing from v2");
	}
	public void gaming () {
		System.out.println("Gaming V2");
	}

	public MobileV2() {
		System.out.println("V2");
	}
	
	// you cannot override static methods, constructors, final methods and private of parent
	// to perform override there should must be parent and child relationship
}
