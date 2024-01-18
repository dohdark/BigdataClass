package 알고리즘문제;

import java.util.Arrays;

public class 알고리즘문제_13번 {

	public static void main(String[] args) {
		// 제한시간 : 15분
		// 획득점수 : 25점
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int A = 0, B = 0, C = 0, D = 0, F = 0;
		String[] scr = score.split(",");
		System.out.println(Arrays.toString(scr));
		for (String c : scr) {
			if (c.equals("A")) {//문자열 비교는 equals사용
				A++;
			} else if (c.equals("B")) {
				B++;
			} else if (c.equals("C")) {
				C++;
			} else if (c.equals("D")) {
				D++;
			} else {
				F++;
			}
		}
		System.out.printf("A:%d명 \nB:%d명 \nC:%d명 \nD:%d명 \nF:%d명", A, B, C, D, F);
	}
}
