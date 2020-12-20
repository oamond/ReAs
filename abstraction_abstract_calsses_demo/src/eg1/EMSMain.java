package eg1;

public class EMSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessing EMS via RevatureEMS");
		EMS revEms = new RevatureEMS();
		revEms.addEmployee();
		revEms.calculateEmployeeLeaves();
		revEms.commonEmployeeBenefits();

	}

}
