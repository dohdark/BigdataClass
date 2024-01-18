package 알고리즘문제;

import java.util.ArrayList;
import java.util.Scanner;

public class 알고리즘문제_25번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요. ");
		String num = sc.next();
		System.out.println(num);

		char[] arr = num.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int sum = 0;

		System.out.println(arr);
//		for (char i : arr) {
//			if (i == '0' || i == '6' || i == '9') {
//				sum += 6;
//			} else if (i == '1') {
//				sum += 2;
//			} else if (i == '2' || i == '3' || i == '5') {
//				sum += 5;
//			} else if (i == '4') {
//				sum += 4;
//			} else if (i == '7') {
//				sum += 3;
//			} else {
//				sum += 7;
//			}
//		}
		
		for (char i : arr) {
			if (i == '0' || i == '9') {
				sum += 6;
			} else if (i == '1') {
				sum += 2;
			} else if (i == '2' || i == '3') {
				sum += 5;
			} else if (i == '8') {
				sum += 7;
			} else if (i == '7') {
				sum += 3;
			} else {
				sum += Character.getNumericValue(i);
			}
		}
		
		System.out.println(sum);

		// 0 -> 6
		// 1 -> 2
		// 2 -> 5
		// 3 -> 5
		// 4 -> 4
		// 5 -> 5
		// 6 -> 6
		// 7 -> 3
		// 8 -> 7
		// 9 -> 6

	}

}
