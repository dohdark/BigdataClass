package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_14번 {

	public static void main(String[] args) {
		// 제한시간 : 15분
		// 획득점수 : 25점
		Scanner sc = new Scanner(System.in);
		System.out.print("N x N 배열에 사용될 N입력 : ");
		int n = sc.nextInt();

		int[][] array = new int[n][n];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j]=cnt++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i%2==1) {//length-1-j는 행이 홀수일때 j를거꾸로출력
					System.out.print(array[i][array.length-1-j]+" ");
				}else {
					System.out.print(array[i][j]+" ");
				}	
			}
			System.out.println();
		}
	}
}
