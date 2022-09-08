package interviewJavaPrograms;

public class Factorial {

	public void findFactorial() {
		
		int findFactorialOf = 5;
		int factValue = 1;
		
		for (int i = findFactorialOf; i > 0; i--) {
			
			factValue = i * factValue;

		}

		System.out.println("Factorial of "+findFactorialOf+" is "+factValue);

	}

	public static void main(String[] args) {

		Factorial myFactorail = new Factorial();
		myFactorail.findFactorial();
	}

}
