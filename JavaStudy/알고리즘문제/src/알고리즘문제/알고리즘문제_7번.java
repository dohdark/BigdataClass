package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_7번 {

	public static void main(String[] args) {
		// 제한시간 : 10분
		// 획득점수 : 15점
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {		// i는 행으로 n행을 의미
			for (int j = 0; j < n-i; j++) {	// j<n-i = i가 1일때 별이 n개만큼 찍힘
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
