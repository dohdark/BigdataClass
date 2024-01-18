package 알고리즘문제;

import java.util.Arrays;
import java.util.Scanner;

public class 알고리즘문제_12번 {

	public static void main(String[] args) {
		// 제한시간 : 13분
		// 획득점수 : 20점
		Scanner sc = new Scanner(System.in);
		System.out.print("N x N 배열에 쓰일 N입력 : ");
		int n = sc.nextInt();
		
		int count=1;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i]=count++; 
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		System.out.println(Arrays.toString(array[3]));
		System.out.println(Arrays.toString(array[4]));
	}

}
