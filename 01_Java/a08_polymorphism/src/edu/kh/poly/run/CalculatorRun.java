package edu.kh.poly.run;

import edu.kh.poly.model.dto.Calculator;
import edu.kh.poly.model.dto.LJSCalculator;
import edu.kh.poly.model.dto.LJSCalculatorV2;
import edu.kh.poly.model.dto.JYJCalculator;

public class CalculatorRun {
	
	public static void main(String[] args) {
		
		// 1. 인터페이스는 객체 생성이 가능할까?
		// Calculator calc  = new Calculator;
		// Calculator calc = new Calculator;
		
		// 2. 인터페이스는 부모 참조 변수가 될 수 있을까?
		// (다형성)
		
		// 동적 바인딩 확인
		Calculator calc = new LJSCalculator();
	//	Calculator calc = new JYJCalculator();
		
		System.out.println(calc.plus(10, 5) );
		
		System.out.println(calc.minus(20, 30) );
		
		System.out.println(calc.multi(8, 9) );
		
		System.out.println(calc.div(5, 3) );
		
		System.out.println(calc.mod(5, 3) );
		
		System.out.println(calc.areaOfCircle(2.5) );
		
		System.out.println(calc.pow(2, 5) );
	}

}
