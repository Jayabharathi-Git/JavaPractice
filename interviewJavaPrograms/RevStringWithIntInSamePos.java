package interviewJavaPrograms;;

public class RevStringWithIntInSamePos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input
		String input = "test123it23all234";

		System.out.println("Original string: " + input);
		// String length
		int n = input.length();
		// flag for int
		boolean intFlag = false;
		// for reverse
		String Reverse_String = "";
		// for reverse after an int
		String revAfterInt = "";
		char ch;
		for (int i = 0; i < n; i++) {
			// iterate through each char of String
			ch = input.charAt(i);
			// if not a digit, rev and concat
			if (!Character.isDigit(ch) && !intFlag)
				Reverse_String = ch + Reverse_String;
			// if digit concat as such
			if (Character.isDigit(ch)) {
				intFlag = true;
				Reverse_String = Reverse_String + revAfterInt + ch;
				revAfterInt = "";
			}
			// after digit rev and store to new rev and concat when next dig encountered
			if (!Character.isDigit(ch) && intFlag)
				revAfterInt = ch + revAfterInt;
		}
		System.out.println("Reversed string: " + Reverse_String);

	}

}
