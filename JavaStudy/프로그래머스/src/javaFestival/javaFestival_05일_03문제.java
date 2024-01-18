package javaFestival;

import java.util.Arrays;
import java.util.Random;

public class javaFestival_05일_03문제 {

	public static void main(String[] args) {
		// 로또 숫자 1~45
		// 6개의 숫자를 중복없이 뽑아야함

		Random rd = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(10) + 1;

			for (int j = 0; j < i; j++) { //j<i = i가 한번돌고실행
				if (lotto[i] == lotto[j]) {//-> i와j가 인접인덱스
					i--;//i를 되돌려서 루프실행
				}
			}
		}
//		for (int j = 0; j < lotto.length; j++) {	// 012345
//			for (int k = lotto.length; k >= 0; k--) {// 012345
//				if (lotto[j] == lotto[lotto.length-1]) {
//					lotto[lotto.length-1] =rd.nextInt();
//				}
//			}
//		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운 :"+lotto[i]);
		}
		System.out.print(Arrays.toString(lotto));

	}
}
