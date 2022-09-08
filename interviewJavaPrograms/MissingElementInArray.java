package interviewJavaPrograms;

import java.util.Arrays;

public class MissingElementInArray {
	
	public void printMissingEleInArray(int[] numArr) {
		
		Arrays.sort(numArr);
		for(int i=0; i<numArr.length;i++) {
			if(numArr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr= {1,2,3,4,8,7,6};
		MissingElementInArray misEleObj=new MissingElementInArray();
		misEleObj.printMissingEleInArray(numArr);
	}

}
