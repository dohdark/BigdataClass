package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {
		// 사용자 입출력 구간
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원가입 ======");
		System.out.print("ID 입력 : ");
		String id = sc.next();

		System.out.print("PW 입력 : ");
		String pw = sc.next();

		System.out.print("name 입력 : ");
		String name = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		// JDBC JavaDatabase Connectivity
		// JDBC 인터페이스 사용방법

		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			// try 구문
			// --> 예외가 발생할 수도 있지만, 우선 시도해보는 구간

			// 1. 드라이버 로딩
			// JDBC 드라이버란?
			// java에서 제공해주는 인터페이스들을 데이터베이스 회사들에서 상속을 받아 로직(몸체)을 구현한 class파일 모음
			Class.forName("com.mysql.cj.jdbc.Driver");
			// --> 반드시 프로젝트에 jar파일 넣어주기 ↑
			// jar 파일이란? -------------------------------------------------------↑
			// 프로젝트 선택 -> 우클릭 -> build path -> configure build path -> libraries
			// class path -> 우측 add external jars -> jar파일경로 -> apply

			// 2. DB연결
			// 준비물 3가지
			// 1) 연결경로
			String url = "jdbc:mysql://localhost/jdbctest";
			// localhost -> ip (192.168.219.64)

			// 2) DB계정이름
			String user = "root";

			// 3) 계정 PW
			String password = "0000";

			conn = DriverManager.getConnection(url, user, password);
			// Connection 타입이란?
			// 데이터 베이스에 접속하기 위한 모든 메소드를 가진 인터페이스(getConnection()의 타입확인)
			// --> DB와 하는 모든 통신은 Connection인터페이스 타입의 conn을 통해서만 이루어진다.
			// Connection == MetaData
			// --> 가용 테이블 목록, 컬럼들에 대한 정보 등 연결된 DB의 모든정보를 가짐

			if (conn != null) {
				// conn안에 뭐라도 있으면 참임
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3. 쿼리문 전송
			// 3-1) 쿼리문 작성
			String sql = "INSERT INTO bigdatamember values(?,?,?,?,?)";

			// ? 인자
			// 사용자로부터 어떤 데이터가 들어올지 모를때 사용
			// 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기

			psmt = conn.prepareStatement(sql);

			// ? 인자를 채우는 작업
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);

			// 4. sql문 실행
			int row = psmt.executeUpdate();

			// 5. 결과를 이용한 작업처리
			// 사용자에게 어떤 모습을 보여주는지 정의
			if (row > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}

		} catch (Exception e) {
			// 모든 예외클래스는 Exception을 상속
			// --> Exception e = new ClassNotFoundException();
			// } catch (ClassNotFoundException | SQLException e) {
			// catch 구문
			// --> 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구간
			// --> ()안쪽에 있는 매개변수는 어떤 예외상황을 잡아줄건지 기술하는 공간

			e.printStackTrace();
			// printStackTrace() 메소드는 예외상황이 왜 발생했고, 어디서 문제가 나고있는지 출력해주는 구문
			// --> 개발할때만 사용, 배포시엔 삭제를 해야함
		} finally {
			// try catch문에서 예외상황이 발생하여도 반드시 한번은 들어오는 구간
			// 6. DB연결 종료 --> 자원 반납

			try {

				// **** 자원을 반납할때는 역순으로 반납 ****
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
