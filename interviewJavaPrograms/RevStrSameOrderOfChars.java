package interviewJavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RevStrSameOrderOfChars {

	public Map<Integer, Integer> getEachWordLength(String input) {
		// map to get each string length in the sentence i.e 1st string and its length
		Map<Integer, Integer> pos = new LinkedHashMap<Integer, Integer>();
		String[] ipCharArr = input.split(" ");
		for (int i = 0; i < ipCharArr.length; i++) {
			pos.put(i + 1, ipCharArr[i].length());
		}
		
		return pos;

	}

	public String replaceSpaceAndReverse(String input) {
		// replace all space with ""
		String replaceAll = input.replaceAll(" ", "");

		// to charArray
		char[] repChar = replaceAll.toCharArray();

		// reverse the String without space
		String rev = "";
		for (int i = repChar.length - 1; i >= 0; i--) {
			rev = rev + repChar[i];
		}
		rev = rev.toLowerCase();
		return rev;
	}

	public String splitRevBasedOnSpacePosition(String rev, Map<Integer, Integer> pos) {
		// split the reversed string based on the position of space and concat to output
		// string

		int startInd = 0, endInd = 0;

		String revOrd, revNew = "";

		for (Map.Entry<Integer, Integer> entry : pos.entrySet()) {
			endInd = entry.getValue();
			endInd = endInd + startInd;

			revOrd = rev.substring(startInd, endInd);

			startInd = endInd;
			if (revNew != "")
				revNew = revNew + " " + revOrd;
			else
				revNew = revNew + revOrd;

		}

		return revNew;

	}

	public static void main(String[] args) {
		// input = "My name is Jaya"
		// output= "ay ajsi em anym"

		// input
		String input = "My name is Jaya";
		
		RevStrSameOrderOfChars obj = new RevStrSameOrderOfChars();
		String output=obj.splitRevBasedOnSpacePosition(obj.replaceSpaceAndReverse(input), obj.getEachWordLength(input));
		
		System.out.println("Input "+input.toLowerCase());
		System.out.println("Output "+output);

	}
}
