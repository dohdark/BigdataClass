package 알고리즘문제;

import java.util.Random;

public class 알고리즘문제_10번 {

	public static void main(String[] args) {
		// 제한시간 : 13분
		// 획득점수 : 20점
		Random rd = new Random();
		int[] arr = new int[8];
		
		
		
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rd.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
			min = min < arr[i] ? min : arr[i];
		}
		
		System.out.println("\n가장 큰 값: "+max);
		System.out.println("가장 작은값: "+min);
		
		
		
	}

}
