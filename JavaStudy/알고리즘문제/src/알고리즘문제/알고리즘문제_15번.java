package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_15번 {

	public static void main(String[] args) {
		// 제한시간 : 15분
		// 획득점수 : 25점
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 :");
		int n = sc.nextInt();
		
		int count=1;	// 1부터 사용해야하기때문에 1로 선언
		int sum=1;		// count가 증가하는 값을 더해야함
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sum;
			sum+=count++;
			System.out.print(arr[i]+" ");
		}
		
	}

}
