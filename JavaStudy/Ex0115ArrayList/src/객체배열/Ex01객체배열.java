package 객체배열;

import java.util.Arrays;

public class Ex01객체배열 {

	public static void main(String[] args) {
		// 1. 객체 배열 생성
		// 자료형[] 변수명 = new 자료형[칸수];
		// 포켓몬 자료형 3개를 보관할 수 있는 bag 배열 생성
		
		Pokemon[] bag = new Pokemon[3];
		
		// 객체 배열 0번 출력
		System.out.println(bag[0]);
		
		// 객체 배열 0번에 포켓몬을 넣어보자!
		Pokemon pkc = new Pokemon("피카츄", "백만볼트", 100, 15, "전기");
		
		//bag[0]=pkc;
		//System.out.println(bag[0].getName());
		bag[0] = new Pokemon("피카츄", "백만볼트", 100, 15, "전기");
		System.out.println(bag[0].getName());
		bag[1] = new Pokemon("파이리", "화염방사", 90, 12, "불");
		bag[2] = new Pokemon("꼬부기", "물대포", 88, 14, "물");
		
		// 배열 안에 들어있는 포켓몬의 이름, 타입, hp를 전부출력
		
		System.out.println("===== 포켓몬 정보 출력 =====");
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName()+"	"+bag[i].getType()+"	"+bag[i].getHp());
			}
		
		
		// 배열안에 저장되어있는 데이터를 for문에서 순차적으로 꺼내 p에 담아 반복한번마다 p를 사용
		for(Pokemon p:bag) {
			System.out.println(p.getName()+"\t"+p.getType()+"\t"+p.getHp());
		}
		
		
	}

}
