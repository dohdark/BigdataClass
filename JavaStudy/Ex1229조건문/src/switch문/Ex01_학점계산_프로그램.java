package switch문;

import java.util.Scanner;

public class Ex01_학점계산_프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade="";
		
		switch(score/10) {
		case 10,9 :
			grade="A";
			break;
		case 8 :
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		default:
			grade="D";
			break;	
		}
		System.out.println(grade+" 학점 입니다.");
		
		
		
		
		
	}

}
