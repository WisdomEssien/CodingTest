package com.Test.one;

public class QuestionOne {

	public static void main(String[] args) {

		int height = 5;
		
		for(int i = 1; i <= height; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
