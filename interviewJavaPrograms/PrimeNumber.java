package interviewJavaPrograms;

public class PrimeNumber {

	public void findPrime(int num) {

		boolean flag = false;

		if (num == 1 || num == 0) {
			System.out.println(num + " is not a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = true;
					break;
				}
			}
		}

		if (flag == false) {
			System.out.println(num + " is a prime Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 13;
		PrimeNumber prNm = new PrimeNumber();
		prNm.findPrime(input);
	}

}
