package javaFestival;

public class javaFestival_03일_02문제 {

	public static void main(String[] args) {
		int sum = 0;
		int pl= 0;
		for(int i=77 ; i>=0 ; i--) {
			pl++;
			sum+=i*pl;
		}System.out.print(sum);
	}
}
