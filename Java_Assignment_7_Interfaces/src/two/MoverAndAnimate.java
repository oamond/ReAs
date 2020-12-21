package two;

public class MoverAndAnimate implements Animatable {

	@Override
	public void move() {
		System.out.println("moving the mover");
	}
	
	@Override
	public void animate() {
		System.out.println("Anymating the object...");
	}

}
