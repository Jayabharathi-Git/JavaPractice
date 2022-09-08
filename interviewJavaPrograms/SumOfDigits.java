package interviewJavaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int sum = 0;

		while (num > 0) {
			int remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}

		System.out.println(sum);

	}

}
