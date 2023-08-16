package ed.kh.thread.ex2;

import java.util.Scanner;

public class StopWatchController {
	
	public void watchStart() {
		Thread stopWatch = new Thread(new StopWatch());
		//스톱워치 스레드 생성
		stopWatch.start();// 스톱워치 실행
		
		System.out.println("<엔터 입력 시 종료>");
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine(); // 엔터 입력 시 까지 무한 대기
		
		// 스톱워치 스레드 멈추게하기
		//-> sleep() 이용 중이라 예외 발생
		stopWatch.interrupt();
	}

}
