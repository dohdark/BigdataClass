package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_31번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼 정수 입력:");
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
