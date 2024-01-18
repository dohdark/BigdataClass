package MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {
	// MVC
	// Controller : 기능들을 가지고 있는 도구

	// 1) 필드
	// 사용자마다 MP3Player가 달라지지 않기 때문에 바로 생성!
	private MP3Player mp3 = new MP3Player();

	private ArrayList<Music> musicList = new ArrayList<Music>();
	private int count = 0; // 카운터

	// 2) 메소드
	// 1. 생성자 메소드
	public MusicController() {
		String comPath = "C:\\Users\\smhrd\\Desktop\\bigdataClass\\JavaStudy\\Ex0115ArrayList\\player\\";

		Music m1 = new Music("HypeBody", "뉴진스", 180, comPath + "HypeBoy.mp3");

		musicList.add(m1);
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가될수있게", "Day6", 185, comPath + "한페이지가될수있게.mp3"));

	}

	// 2. 재생하는 메소드
	public Music play(int songNum) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(songNum-1).getPath());

		return musicList.get(songNum-1);
	}
	

	// 3. 정지하는 메소드

	public boolean stop() {
		boolean result = false;
		if (mp3.isPlaying()) {
			mp3.stop();
			result = true;
		}
		return result; // return isPlaying()하면 안되나??
	}

	// 4. 이전 곡으로 돌아가기

	public Music back() {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		count--;

		if (count >= 0) {
			mp3.play(musicList.get(count).getPath());

			return musicList.get(count);
		} else {

			count = 0;
			return null;
		}

	}

	// 5. 다음 곡으로 돌아가기

	public Music front() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		count++;

		if (count < musicList.size()) {
			mp3.play(musicList.get(count).getPath());

			return musicList.get(count);
		} else {

			count = musicList.size() - 1;
			return null;
		}

	}


}
