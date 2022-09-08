package learnCollectionss;

import java.util.HashSet;
import java.util.Set;

public class PrintUnique {

	public static String input = "babu";
	public static Set<Character> uniqueSet = new HashSet<Character>();

	public char[] stringToCharArr(String input) {
		char[] charArray = input.toCharArray();
		return charArray;
	}

	public Set<Character> findUnique(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			if (!(uniqueSet.contains(charArray[i]))) {
				uniqueSet.add(charArray[i]);
			} else
				uniqueSet.remove(charArray[i]);
		}
		return uniqueSet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintUnique uniq = new PrintUnique();

		uniqueSet = uniq.findUnique(uniq.stringToCharArr(input));
		System.out.println("Unique characters in the given string " + input + " are: " + uniqueSet);

	}

}
