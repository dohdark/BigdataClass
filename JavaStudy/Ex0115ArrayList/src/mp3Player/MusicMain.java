package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 노래를 재생시키는 도구 생성하기 --> MP3Player
		MP3Player mp3 = new MP3Player();
		String comPath = "C:\\Users\\smhrd\\Desktop\\bigdataClass\\JavaStudy\\Ex0115ArrayList\\player\\";
		// 2. 노래 데이터를 생성/ 해당하는 자료형이 없기때문에 클래스 생성
		// 노래 데이터를 전부 저장하는 ArrayList생성, 이름은 musicList

		Music m1 = new Music("HypeBody", "뉴진스", 180, comPath + "HypeBoy.mp3");

		ArrayList<Music> musicList = new ArrayList<Music>();

		musicList.add(m1);
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가될수있게", "Day6", 185, comPath + "한페이지가될수있게.mp3"));
		int count = 0;
		System.out.println("============동현의 mp3player============");
		
		
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int input = sc.nextInt();
			
			if (input == 1) {
				System.out.println("\n===================재생=================\n");
				// 1. 재생중인 노래가 있는지 여부를 판단
				// 2. 재생중이라면 노래를 멈추기
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				// 3. musicList의 0번 인덱스에 있는 객체를 재생
				// 노래의 주소가 필요함
				mp3.play(musicList.get(count).getPath());
				
				// 4. 가수 - 노래 제목이 재생중입니다 출력
				System.out.println(musicList.get(count).getSinger()+" - "+musicList.get(count).getTitle()+"\n");
				
				
				
				
				
				
				
			} else if (input == 2) {
				System.out.println("===================정지==================\n");
				// 1. 재생중인 노래가 있는지 여부를 판단
				// 2. 재생중이라면 노래를 멈추기
				if(mp3.isPlaying()) {
					mp3.stop();
					System.out.println("노래 재생을 정지합니다. \n");
					
				}else {
					System.out.println("재생중인 노래가 없습니다 \n");
				}
				
				
				
				
				
				
				
				
				
			} else if (input == 3) {
				System.out.println("========이전곡========\n");
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				if(count<=0) {
					System.out.println("이전 곡이 없습니다 다시입력\n");
					continue;
					}
				
				
				count--;
				mp3.play(musicList.get(count).getPath());
				System.out.println(musicList.get(count).getSinger()+" - "+musicList.get(count).getTitle()+"\n");
				
				
				
				
				
				
				
			} else if (input == 4) {
				System.out.println("========다음곡========\n");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				if(count>=4) {					
					
					System.out.println("다음 곡이 없습니다 다시입력\n");
					continue;
					}
//				if(count>=4) {
//					count=(musicList.size()-1);
//					mp3.play(musicList.get(count).getPath());
//					System.out.println(musicList.get(count).getSinger()+" - "+musicList.get(count).getTitle()+"\n");
//				}
				
				
				
				// 1. 재생중인 노래가 있는지 여부 판단
				// 2. 재생중이라면 노래 정지
				// 3. musicList에서 다음곡 재생
				count++;
				
				
				mp3.play(musicList.get(count).getPath());
				System.out.println(musicList.get(count).getSinger()+" - "+musicList.get(count).getTitle()+"\n");
				
				
				
				
				
			} else if (input == 5) {
				System.out.println("\n========mp3종료========\n");
				
				if(mp3.isPlaying()) {
					mp3.stop();					
				}
				break;
				
				
				
				
				
				
				
				
			} else {
				System.out.println("번호를 잘못 누르셧습니다.");
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}

}
