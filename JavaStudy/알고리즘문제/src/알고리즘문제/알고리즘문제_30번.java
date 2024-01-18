package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_30번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String str = sc.nextLine().trim().toLowerCase();
		char[] ch = str.toCharArray();

		int[] array = new int[26];
		for (int j = 0; j < ch.length; j++) {
			for (int i = 97; i <= 122; i++) {
				if (ch[j] == i) {
					array[i - 97] += 1;
				}
			}
		}
		for (int i = 97, j = 0; i <= 122; i++, j++) {
			System.out.println((char) (i) + " : " + array[j]);
		}
		
		
		
	}
}
