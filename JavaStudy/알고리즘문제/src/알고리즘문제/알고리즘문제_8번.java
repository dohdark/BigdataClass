package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_8번 {

	public static void main(String[] args) {
		// 제한시간 : 8분
		// 획득점수 : 20점

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();

		if ((num % 10) < 5) { // num의 1의 자리가 5보다 작을때
			num -= (num % 10);// num에서 그 나머지를 뺀다(내림)
		} else {
			num += 10 - (num % 10); //나머지-> 10에 나머지값을 뺀값을 더한다(올림)
		}
		System.out.print("반올림 수 : " + num);

	}

}
