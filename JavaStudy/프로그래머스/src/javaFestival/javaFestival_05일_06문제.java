package javaFestival;

import java.util.Arrays;

public class javaFestival_05일_06문제 {

	public static void main(String[] args) {
		
		String score = "oooxoo"; // 0~5 6개
		String[] arr = new String [score.length()];
		int numScore=0;
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i < score.length(); i++) {
		    arr[i] = String.valueOf(score.charAt(i));
		}
		System.out.println(Arrays.toString(arr));
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]=="o") {
//				
//			}
//		}
		
		
		
		for(String i : arr) {
			if(i=="o") {
				count++;
				numScore = count + numScore;
			}else {
				count--;
				count2++;
				numScore += count2;
			}
		}
		
		
		
		
		
		
		
	}

	private static char[] indexOf(String score) {
		// TODO Auto-generated method stub
		return null;
	}

}
