
public class ConditionBlocks {

	public static void main(String[] args) {
		boolean FirstCondition = true;
		boolean SecondCondition = true;
		
		if (FirstCondition){
			System.out.println("inside the if-statement");
			
			if (SecondCondition){
				System.out.println("inside the nested if-statement");
			}
		}else if (SecondCondition){
			System.out.println("5");
		}else {
			System.out.println("inside the else-statement");
		}
		
		System.out.println("Outside of the if-statement");
	}

}
