package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		int[][] array = new int[3][3];
		array[1][1]=5;
		System.out.println(array[1][1]);
		
		//이차원배열에 값 넣기(1~9)
		
		int count=1;
		for (int i = 0; i < array.length; i++) {
			array[0][i]=count++;
		}
		for (int i = 0; i < array.length; i++) {
			array[1][i]=count++;
		}
		for (int i = 0; i < array.length; i++) {
			array[2][i]=count++;
		}
		
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i <=2 ; i++) {
			for(int j = 0; j<=2; j++) {
				array[i][j]=count++;
				System.out.print(array[i][j]+"	");
			}
			System.out.println();
		}
		
		
		
	}

}
