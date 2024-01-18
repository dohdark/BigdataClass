package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// 게임을 실행하는 공간
		// 게임칩 가지고오기
		Pokemon p = new Pokemon();
		Mario m = new Mario();
		Zelda z = new Zelda();
		Dongmul d = new Dongmul();
		insert(p);
		insert(d);
		insert(m);
		insert(z);
		
		
		

	}
	// 게임칩을 끼우는 기능 메소드
	private static void insert(GameChip game) {
		game.gameStart();		
	}
}
