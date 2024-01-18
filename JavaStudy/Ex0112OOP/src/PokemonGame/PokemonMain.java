package PokemonGame;

import java.util.Scanner;

public class PokemonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// -실행공간
		// 두마리 포켓몬 생성(객체 생성)
		// 메타몽 / 노멀 / 변신하기 / hp : 80 / atk : 10 /
		// 피카츄 / 전기 / 110볼트 / hp : 100/ atk : 15 /
		Pokemon mtm = new Pokemon("메타몽", "변신하기", 80, 10, "노말");
		Pokemon pkc = new Pokemon("피카츄", "100볼트", 100, 15, "전기");

		while (true) {
			System.out.println("포켓몬을 선택하세요 ");
			System.out.print("[1]메타몽 [2]피카츄 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 사용자가 메타몽을 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반공격 [2]스킬 공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 메타몽이 피카츄를 일반 공격하겠다.
					// 메타몽의 atk만큼 피카츄의 hp가 감소한다.
					// 피카츄의 현재 hp - 메타몽의 atk
					// 두마리 포켓몬의 현재 hp 출력

					pkc.setHp(pkc.getHp() - mtm.getAtk());
					System.out.printf("\n메타몽 체력 :%d\n피카츄 체력 :%d\n\n", mtm.getHp(), pkc.getHp());
					

				} else if (choiceAtk == 2) {
					// 메타몽이 피카츄를 스킬 공격하겠다.

					pkc.setHp((int) (pkc.getHp() - mtm.getAtk() * 1.5));
					// 메타몽의 스킬을 출력
					System.out.println();
					System.out.println(mtm.getName() + "!!!!" + mtm.getSkill() + "!!!!");
					System.out.printf("\n메타몽 체력 :%d\n피카츄 체력 :%d\n\n", mtm.getHp(), pkc.getHp());

				}
				if(pkc.getHp()<=0) {
					System.out.print("피카츄 사망 메타몽 승리");
					break;
				}

			} else if (choice == 2) {
				// 사용자가 피카츄를 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반공격	[2]스킬 공격 >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 피카츄가 메타몽을 일반 공격하겠다.
					// 1. 피카츄의 atk 만큼 메타몽의 hp가 감소
					mtm.setHp(mtm.getHp() - pkc.getAtk());
					System.out.printf("\n메타몽 체력 :%d\n피카츄 체력 :%d\n\n", mtm.getHp(), pkc.getHp());

				} else if (choiceAtk == 2) {
					// 피카츄가 메타몽 스킬 공격하겠다.
					System.out.println();
					System.out.println(pkc.getName() + "!!!!" + pkc.getSkill() + "!!!!");
					mtm.setHp((int) (mtm.getHp() - pkc.getAtk() * 1.5));

					System.out.printf("\n메타몽 체력 :%d\n피카츄 체력 :%d\n\n", mtm.getHp(), pkc.getHp());

				}
				
				if(mtm.getHp()<=0) {
					System.out.print("메타몽 사망 피카츄 승리");
					break;
				}
				
			} else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}
			/////////////////////////////////////////////////////
			// 1. 둘중 한마리의 포켓몬의 hp가 0보다 작거나 같을때 종료!
			// 2. 승리한 포켓몬 출력
			// 3. Pokemon 설계도는 건들지 말 것.
			
			
			
		}
	}
}
