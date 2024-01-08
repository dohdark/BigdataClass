package 다중if문;

import java.util.Scanner;

public class Ex_02_학점계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade="";
		
		if(score>=90) {
			grade="A";
			
		}else if(score>=80) {
			grade="B";
			
		}else if(score>=70) {
			grade="C";
			
		}else
			grade="D";
		
		System.out.println(grade+" 학점입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
