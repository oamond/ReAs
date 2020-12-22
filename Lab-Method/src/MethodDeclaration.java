import java.util.Random;

public class MethodDeclaration {
	public static void  main(String[] args) {
		//create class instance 
		
		MethodDeclaration md = new MethodDeclaration();
		
		//call your first method here
		
		md.talk();
		//call the second method here.	
		int value = 150;
		int sameValue  = md.getInt(value);
		System.out.println(sameValue);
		
		//call the third method here
		System.out.println(md.sum(1, 2, 4.5));
		
		
		//calling out practice method "randomNumber"
		
		md.randomNumber();
		
		

	}
	
	//create your first method here
	
	public void talk() {
		System.out.println("inside of the talk method");
		
	}
	
	public int getInt(int input) {
		return input;
	}

	
	public double sum(int x, int y, double z ) {
		return x+y+z;
	}
	
	public void randomNumber() {
		
		int a = (int) ((Math.random()*50)+1);
		System.out.println(a);
	}
}
