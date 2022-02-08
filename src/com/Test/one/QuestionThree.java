package com.Test.one;

public class QuestionThree {

	public static void main(String[] args) {

//		int[] input = new int[] {2,7,11,15};
//		int target = 9;
		
		int[] input = new int[] {3, 2, 4};
		int target = 6;
		
		String result ="";
		for(int index = 1; index < input.length; index++) {
			if(input[index-1] + input[index] == target) {
				result += (index-1) + "," + index;
			}
		}
		System.out.println(result);
	}

}
