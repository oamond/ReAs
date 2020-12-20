package eg1;
	//its a feature no implementation
	//abstract classes are incomplete - 
	//this is where you list down the needs of the application
public abstract class EMS {
	
	public abstract void addEmployee(); 
	public abstract void updateEmployee();
	public abstract void calculateEmployeeLeaves();
	public abstract void searchEmployee();
	public abstract void removeEmployee(); 
	
	public void commonEmployeeBenefits() {
		
	System.out.println("common across all the employees");
	}
	

}
