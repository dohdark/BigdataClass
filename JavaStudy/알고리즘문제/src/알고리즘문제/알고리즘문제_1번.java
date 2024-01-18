package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_1번 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int w = sc.nextInt(); // 현재 몸무게 입력받음
		System.out.print("목표 몸무게 : ");
		int tw = sc.nextInt(); // 목표 몸무게 입력받음
		int month = 0;
		int ow = 0;			// 감량한 몸무게
		while (w > tw) {	// 현재 몸무게가 목표몸무게보다 낮을때 종료
			System.out.print(++month + "주차 감량 몸무게 : ");
			ow = sc.nextInt();	// 감량 몸무게 입력
			w -= ow;			// 현재 몸무게 에서 감량몸무게 빼고 누적
		}
		System.out.println(w + "kg 달성 축하!");

	}

}
