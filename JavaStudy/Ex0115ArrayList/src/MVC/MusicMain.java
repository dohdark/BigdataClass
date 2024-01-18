package MVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {
	// MVC
	// View : 사용자 화면
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 노래 재생을 담당하는 컨트롤러 생성
		MusicController con = new MusicController();

		System.out.println("============동현의 mp3player============");

		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("\n===================재생=================\n");
				System.out.print("몇번째 노래를 재생시키겠습니까? >>");
				int songNum = sc.nextInt();
				
				
				Music m = con.play(songNum);

				System.out.println(m.getSinger() + " - " + m.getTitle() + "\n");

			} else if (input == 2) {
				System.out.println("===================정지==================\n");
				if (con.stop()) {
					System.out.println("노래 재생을 정지합니다. \n");
				} else {
					System.out.println("재생중인 노래가 없습니다 \n");
				}

			} else if (input == 3) {
				Music m = con.back();

				System.out.println("========이전곡========\n");
				if (m != null) {

					System.out.println(m.getSinger() + " - " + m.getTitle() + "\n");

				} else {

					System.out.println("이전 곡이 없습니다 다시입력\n");
				}

			} else if (input == 4) {
				System.out.println("========다음곡========\n");
				Music m = con.front();
				if (m != null) {

					System.out.println(m.getSinger() + " - " + m.getTitle() + "\n");
				} else {
					System.out.println("다음 곡이 없습니다 다시입력\n");
				}

			} else if (input == 5) {

				con.stop();
				System.out.println("\n========mp3종료========\n");
				break;

			} else {
				System.out.println("번호를 잘못 누르셧습니다.");

			}
		}
	}
}
