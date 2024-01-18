package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num % 10 >= 5) {
			System.out.print("반올림수 :");
			System.out.print(num+(10-(num%10)));
		}else {
			System.out.print("반올림수 :");
			System.out.print(num-(num%10));
		}
		System.out.println();

	}
}
