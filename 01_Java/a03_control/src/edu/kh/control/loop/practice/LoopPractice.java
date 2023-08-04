package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
		while(input != -1) {
			
			
		}
		System.out.println(input);
	}
	
	
	
	public void practice2() {
		
		
		
		
	}
	

	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println("정수를 하나 입력하세요 : ");
		
		int sum = 0;
		
		for(int i =1 ; i <=input ; i++) {
			sum += i;
			
			System.out.print(i + " + ");
			if(i < input) {
				System.out.print(" + ");
			}
		}
		System.out.println("=" + sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		// 입력 받은 두 수가 모두 1 이상인가?
		if(input1 >= 1 && input2 >=1 ) {
			// 작은 수부터 큰 수 까지 1씩 증가하며 반복
			if(input1 <= input2) {
				
				for(int i = input1 ; i <=input2 ; i++) {
				 System.out.print(i + " ");
				}
			}
			
			
		} else { // 나중에 입력한 수가 작을 때
			
			for(int i = input1 ; i <=input2 ; i++) {
				System.out.println(i + " " );
			}
				
				
				
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	
	}
	
	public void practice5() {
		
		
		
	}	
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int input = sc.nextInt();	
		
		if(!(input >=2 && input <=9)) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
			
		} else {
			
			for(int dan = 2 ; dan <= 9 ; dan++) {
				System.out.printf("====%d단 ====\n", dan);
				
				for(int i =1 ; i<=9 ; i++) {
					System.out.printf("%d x %d = %d \n", dan , i , dan*i);
				}
			}
		}
	}
}
