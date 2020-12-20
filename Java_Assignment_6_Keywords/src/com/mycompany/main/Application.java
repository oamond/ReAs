package com.mycompany.main;

public class Application {

	public static void main(String[] args) {
		
		float x, y;
		x = 100.55f;
		y = 1291.324f;
		System.out.println("addition result : "+ StaticClass.sum(x, y));
		
		FinalClass a = new FinalClass();
		System.out.println("The Constant : "+a.myConstant);
		
		ConcreteClass cc = new ConcreteClass();
		cc.run();
		
		
		
		
		
		
		
		

	}

}
