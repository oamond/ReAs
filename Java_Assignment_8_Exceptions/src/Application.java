
public class Application {

	public static void main(String[] args) throws CustomException {
		 Runner runner = new Runner();
		 
		 try {
			 runner.run();
		 } catch (CustomException e) {
			 e.printStackTrace();
		 }
		

	}

}
