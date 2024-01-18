package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_5번 {

	public static void main(String[] args) {
		// 제한시간 : 10분
		// 획득점수 : 15점
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {	// i는 행으로 쓰임 0~7 총 8번 실행
			for (int j = 0; j <= i; j++) {//j는 i까지 실행으로 i가 1씩늘어날때 찍히는 별이 하나씩 늘어나게함
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
}
