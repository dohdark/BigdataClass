package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] rannum = new int[5];
		int count = 0;
		
		
		
		System.out.print("array에 들어있는 홀수는 ");
		for (int i = 0; i <= rannum.length - 1; i++) {
			
			int random = rd.nextInt(100) + 1;
			rannum[i] = random;
			
			if (rannum[i] % 2 == 1) {
				count++;
				System.out.print(rannum[i]+" ");
			}
		}
		System.out.println("이며,");
		System.out.printf("총 %d 개 입니다. ",count);
	}
}
