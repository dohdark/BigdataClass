package javaFestival;

import java.util.Scanner;

public class javaFestival_06일_02문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N * N 배열 생성에 들어갈 정수 입력: ");
		int num = sc.nextInt();
		int count = 1;
		int[][] numArr = new int[num][num];

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				numArr[i][j] = count++;
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
