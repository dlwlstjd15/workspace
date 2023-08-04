package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	// 실습문제1
	public void practice1() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요. : ");
		int input = sc.nextInt();
		
		String result; 
		
		if(input > 0 && input % 2 == 0 ) {
			result = "짝수입니다";
			
		} else if(input > 0 && input % 2 == 1) {
			result = "홀수입니다";
		} else  {
			result = "양수만 입력해주세요";
		}
		 
		System.out.println(result);
	}
		
	
	// 실습문제2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum / 3.0;
		
		String result;
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			
			result = " 축하합니다, 합격입니다!";
			
		} else {
			result = "불합격입니다";
		}
		System.out.println(result);
		
	}
	// 실습문제3
	public void practice3() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int day = 0;// 해당하는 달의 마지막 일을 저장
		            // 단 , 1~12월이 아니면 0을 저장
		
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7: case 8 : case 10 : case 12 : day = 31; break;
		case 4 :case 6 : case 9 : case 11 : day = 30; break;
		case 2 : day = 28; break;
		}
		
		if(day == 0) {
			System.out.printf("%d월은 잘못 입력된 달입니다." , month);
			
		} else {
			System.out.printf("%d월은 %d일까지 있습니다. ", month, day);
		}
		
	
	}
	// 실습문제4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 (m)를 입력해 주세요 : ");
		double h = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double w = sc.nextDouble();
		
		double bmi = w / (h *h);
		String str; //결과저장
		if(bmi < 18.5) {
			str = "저체중";
			
		} else if(bmi >= 18.5 && bmi < 23) {
			str = "정상체중";
			
		} else if (bmi >= 25 && bmi < 30) {
			str = "비만";
			
		} else {
			str = "고도비만";
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(str);
	}
	
	// 실습문제5
	public void practice5() {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("중간 고사 점수 : ");
		int midTerm = sc.nextInt();
		
		System.out.println("기말 고사 점수 : ");
		int finalTerm = sc.nextInt();
		
		System.out.println("과제 점수 : ");
		int homework = sc.nextInt();
		
		System.out.println("출석 점수 : ");
		int attendance = sc.nextInt();
		
		// 출석 횟수가 부족한 경우 14회 이하
		if(attendance <= 14) {
		  System.out.printf("Fail [출석 횟수 부족 (%d/20)] ", attendance);
		  
		} else { // 출석은 잘했을 때
			// 점수 환산
			double midScore = midTerm * 0.2;
			double finalScore = finalTerm * 0.3;
			double homeworkScore = homework * 0.;
			
			double attScore = attendance * 5 * 0.2; // ==attendance
			
			// 총점
			double sum = midScore + finalScore + homeworkScore + attScore;
			
			System.out.println("중간 고사 점수(20) : " + midScore);
			System.out.println("기말 고사 점수(30) : " + finalScore);
			System.out.println("과제 점수(30) : " + homeworkScore);
			System.out.println("출석 점수(20) : " + attScore);
			System.out.println("총점 : " + sum);
			if(sum >= 70) {
				System.out.println("PASS");
				
			} else {
				System.out.println("FALL (점수미달)");
			}
		}
		
	}

}
