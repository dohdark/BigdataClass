package javaFestival;

import java.util.Random;
import java.util.Scanner;

public class javaFestival_02일_03번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		
		
	
		while(true) {
			int random = ran.nextInt(8)+1;
			int random2 = ran.nextInt(8)+1;
			
			System.out.print(random + " + " + random2 + " = ");			
			int result = sc.nextInt();
			
			if(result == random+random2) {
				System.out.println("SUCCESS! ");
			}else {
				System.out.println("Fail! ");
				count++;
				if(count>=5) {
					System.out.println("Game Over..!");
					break;
				}
			}
			
			
			
		}

	}

}
