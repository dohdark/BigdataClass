package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();

		System.out.print("정수 2: ");
		int num2 = sc.nextInt();

		System.out.print("연산 기호 입력: ");
		char op = sc.next().charAt(0);

		System.out.println(cal2(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else {
			return 0;
		}

		return result;
	}

	public static int cal2(int num1, int num2, char op) {
		switch (op) {

		case '-':
			return num1 - num2 > 0 ? num1 - num2 : num2 - num1;
		case '+':
			return num1 + num2;
		case '/':
			return num1 / num2;
		case '*':
			return num1 * num2;
		default:
			System.out.print("사칙연산만 입력해주세요");
			return 0;

		}
	}
}
