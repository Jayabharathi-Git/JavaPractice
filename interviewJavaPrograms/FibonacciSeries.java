package interviewJavaPrograms;

public class FibonacciSeries {

	public void printFibonacci(int num) {
		int firstTerm = 0;
		int secTerm = 1;

		System.out.println("Fibonacci Series till " + num + " terms");
		for (int i = 1; i <= num; i++) {

			System.out.print(firstTerm + " ");
			int nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 8;
		FibonacciSeries fibSer = new FibonacciSeries();
		fibSer.printFibonacci(number);
	}

}
