package interviewJavaPrograms;

import java.util.Arrays;

public class SecondLargestEleInArray {
	
	public int findSecLargestInArray(int[] nums) {
		
		Arrays.sort(nums);
		int secLargest = nums[(nums.length)-2];
		
		return secLargest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondLargestEleInArray secLarg=new SecondLargestEleInArray();
		int[] nums = {25,10,11,65,80,45};
		System.out.println("Second largest is "+secLarg.findSecLargestInArray(nums));
	}

}
