package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice4 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("나이");
	int input = sc.nextInt();
	
	String result = input <= 13 ? "어린이" :
			(input > 19 ? "성인" : "청소년");
		
	// String result = input <= 13 ? "어린이" : ( input <=19 ? "청소년 : "성인");

	
	//age가 15인 경우
	// 어린이를 찾는 조건 (age <=13)을 만족하지 못하므로
	// 이후에는 age가 13 이하인 경우를 범위에서 제외하면 된다.
	
	//-> 청소년을 찾는 조건을 age <=19 라고만 작성해도
	// 13이하를 제외하기 때문에
	// age >13 && age <=19 조건과 동일 조건이 성립한다.
	
	System.out.println(result);
	
	}

}
