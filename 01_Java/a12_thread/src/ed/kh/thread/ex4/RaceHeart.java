package ed.kh.thread.ex4;

import java.util.Random;

public class RaceHeart implements Runnable {

	@Override
	public void run() {
		
		Random ran = new Random();  // 난수 생성 객체(java.utill.Random)
		
		try { 
			for(int i =0; i<=10; i++) {
				
				// 콘솔창 클리어
				RaceRun.clear();
				
				if(i==0) { // 첫 번째 반복인 경우
					System.out.println("준비");
					System.out.println("♡");
					System.out.print("★");
					
					Thread.sleep(1000);
					continue;// 다음 반복으로 이동
					
				}
				
				// i가 1~10인 경우
				System.out.println(i + "회차");
				
				int temp = ran.nextInt(5)+1; // 0,1,2,3,4       1,2,3,4,5중 하나의 난수 발생
				
				//생성된 난수를 heartCount에 누적
				RaceRun.heartCount+= temp;
				
				// "♡(난수)칸 이동" 출력
				System.out.println("♡" + temp + "칸 이동");
				
				// hearCount 누적된 숫자 만큼 - 표시 후 하트 출력
				for(int h=0; h<RaceRun.heartCount; h++) {
					System.out.print("-");
				}
				System.out.println("♡");
				
				
				// startCount만큼 -표시 후
				for(int s=0; s<RaceRun.startCount; s++) {
					System.out.print("-");
				}
				System.out.print("★");
				
				
				Thread.sleep(1000); // 1초 일시정지
			}
			
		}catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
				
	}
	
	

}
