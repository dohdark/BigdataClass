package 배열;

import java.util.Random;

public class Ex04배열예제_가장큰수찾기 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] rannum = new int[5];
		System.out.print("배열 안에 들어있는 값 : ");
		for (int i = 0; i <= rannum.length - 1; i++) {
			int random = rd.nextInt(10) + 1;
			rannum[i] = random;
			System.out.print(rannum[i] + " ");
		}
		int max = rannum[0];
		int min = rannum[0];
		// rannum 에 랜덤정수 5개 할당
		for (int j = 0; j < rannum.length; j++) {
			if(rannum[j] > max) { // 하나씩 크기비교해서 큰게 max로
				max = rannum[j];
			}
			if(rannum[j] < min) { // 하나씩 비교해서 작은게 min으로
				min = rannum[j];
			}
		}
		System.out.println("\n가장 큰 수 : "+ max);
		System.out.print("가장 작은 수 : "+ min);
	}
}
