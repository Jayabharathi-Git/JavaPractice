package interviewJavaPrograms;

public class ArmstrongNumber {

	public void printArmstrong(int input) {

		int sum = 0;
		int quot = input;

		while (quot > 0) {
			int rem = quot % 10;
			sum = sum + (rem * rem * rem);
			quot = quot / 10;
		}

		if (sum == input) {
			System.out.println("Is a ArmstrongNumber");
		} else
			System.out.println("Not a ArmstrongNumber");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		ArmstrongNumber amNum = new ArmstrongNumber();
		amNum.printArmstrong(input);
	}

}
