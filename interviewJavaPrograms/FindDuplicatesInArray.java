package interviewJavaPrograms;

public class FindDuplicatesInArray {
	
	public void findDuplicates(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {14,12,13,11,15,14,18,16,17,19,18,17,20,20};
		FindDuplicatesInArray dupObj=new FindDuplicatesInArray();
		dupObj.findDuplicates(nums);
	}

}
