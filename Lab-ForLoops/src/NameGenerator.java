
public class NameGenerator {

	public static void main(String[] args) {
		
		String firstName[] = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan","Memphis", "Nicky", "Sarah", "William"};
		String lastName[] = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		for (int i = 0; i < firstName.length; i++) {
			for (int j = 0; j < lastName.length; j++) {
				String FirstName = firstName[i];
				String LastName = lastName[j];
				
				System.out.println(FirstName+" "+LastName);
				
			}
		}
		
	}

}
