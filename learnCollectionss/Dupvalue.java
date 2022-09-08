package learnCollectionss;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Dupvalue {

	public static Set<Integer> dupremove(Integer[] dr) {

		Set<Integer> set1 = new TreeSet<Integer>();

		set1.addAll(Arrays.asList(dr));
		set1.retainAll(set1);
		return set1;

	}

	public static void main(String[] args) {

		Integer[] A = { 22, 45, 33, 66, 55, 34, 33, 77 };
		int[] B = { 22, 44, 33, 88, 55, 99, 99, 77 };

		System.out.println(Dupvalue.dupremove(A));

	}

}
