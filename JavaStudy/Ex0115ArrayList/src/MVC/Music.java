package MVC;

public class Music {
	// MVC model view controller
	// Model : 
	
	
	
	// 뮤직 플레이어 안에서 사용할 우리만의 음악 자료형
	
	// 1. 노래 데이터의 제목
	private String title;
	// 2. 가수
	private String singer;	
	// 3. 재생 시간
	private int playTime;
	// 4. 실제 노래 파일의 경로(주소값)
	private String path;
	
	// --- 메소드 ---
	// 1. 모든 필드값을 채울 수 있는 생성자
	
	public Music(String title, String singer, int playTime, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	String getTitle() {
		return title;
	}
	String getSinger() {
		return singer;
	}
	int getPlayTime() {
		return playTime;
	}
	String getPath() {
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
