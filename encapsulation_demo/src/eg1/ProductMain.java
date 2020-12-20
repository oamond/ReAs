package eg1;

public class ProductMain {
	public static void main(String[] args) {
		
		Product p1 = new Product(100, "TV", 123.33);
		System.out.println("Printing p1");
		p1.PrintProduct();
		
		p1.setName("Televion");
		System.out.println("Product name of p1 is "+p1.getName());
	}

}
