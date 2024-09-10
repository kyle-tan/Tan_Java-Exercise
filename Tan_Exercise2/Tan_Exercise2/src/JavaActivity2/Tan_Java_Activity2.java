package JavaActivity2;

import java.util.Arrays;

public class Tan_Java_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayVar = {3,5,9,1,8,2,4};
		int target = 10;
		int target2 = 15;
		System.out.println(findSumIndices(arrayVar, target) != null ? 
				Arrays.toString(findSumIndices(arrayVar, target)): "No Match Found");
		System.out.println(findSumIndices(arrayVar, target2) != null ? 
				Arrays.toString(findSumIndices(arrayVar, target2)): "No Match Found");
		
	}
	public static int[] findSumIndices(int[] arrayData, int target) {
		int[] addendsIndices = new int[2];
		for (int i = 0; i < arrayData.length; i++) {
			for(int j = i + 1; j < arrayData.length; j++) {
				if (arrayData[i] + arrayData[j] == target) {
					addendsIndices[0] = i;
					addendsIndices[1] = j;
				}
			}
		}
		if(addendsIndices[0] == 0 && addendsIndices[1] == 0) {
			addendsIndices = null;
		}
		return addendsIndices;
	}

}
