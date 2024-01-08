package dowhile문;

import java.util.Random;

public class Ex랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤한 숫자를 뽑아내는 방법
		// 1. 랜덤한 숫자를 뽑아내는 도구를 꺼내오기
		Random ran = new Random();
		// 2. 랜덤한 수 생성하기
		// 1부터 9까지 범위지정하기
		int ranNum = ran.nextInt(9)+1; //+1 함으로 0~8에서 1~9로 됨
		// 0부터 시작해서 추출하고 싶은 숫자의 갯수를 적기
		System.out.println(ranNum);
		
	}

}
