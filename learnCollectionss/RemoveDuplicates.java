package learnCollectionss;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	
	//convert given string to array of strings
	public String[] toStringArr(String str) {
		String[] strArr = str.split(" ");
		return strArr;
	}

	//convert String[] to Set - remove duplicates
	public Set<String> arrayToSet(String[] strArr) {
		Set<String> remDups = new LinkedHashSet<String>();
		for (String s : strArr)
			remDups.add(s);
		return remDups;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		RemoveDuplicates dups = new RemoveDuplicates();
		Set<String> arrayToSet = dups.arrayToSet(dups.toStringArr(text));
		System.out.println("Given text :" + text);
		System.out.println("After removing duplicates :" + arrayToSet);

	}

}
