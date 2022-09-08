package learnCollectionss;

import java.util.HashSet;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "amazon";
		char[] charArray = name.toCharArray();

		Set<Character> unique = new HashSet<Character>();

		for (char c : charArray) {
			unique.add(c);
			
		}
		
		System.out.println(unique);
	}

}
