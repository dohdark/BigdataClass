package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_2번 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		int realtime = 5000;
		int money = 0;
		
		if(time >= 8) {
			money = (int) ((8*realtime)+(time-8)*(realtime*1.5));
		}
		System.out.print(money+"원 입니다.");
		
	}

}
