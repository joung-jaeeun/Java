package a05_연산자;

public class Operration2 {
		/** 
		 * 
		 * <논리연산자> 참, 거짓  boolean
		 * AND연산(&&) = 곱
		 * OR연산(||)  = 합   쉬프트 누르고 엔터 위에 두개	 
		 * NOT연산(!)  = 반전
		 * 
		 * 
		 * true(1)
		 * false(0)
		 * 
		 * 
		 * -AND-곱
		 * true && false => false 1*0=0
		 * true && true => true
		 * false &&false => false
		 * 
		 * 
		 * -OR-합
		 * true || false => true
		 * true || true => true
		 * false || false => false
		 * 
		 * ---->이산수학 (컴퓨터수학을 의미)
		 * 
		 * NOT
		 * !true => false
		 * !false => true
		 * 
		 * 
		 * !(true && true) => false
		 * !(false || false) => true
		 * 
		 */
//		System.out.println(!(true && true));
	
		
		
		/**
		 * 삼항(조건)연산자
		 * boolean trueAndFalse = 조건 ? 결과(참) : 결과(거짓)
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
//		
		boolean trueAndFalse = (10<20) ? true: false;
		String grade = (59 < 60) ? "F등급" : "F가 아닙니다.";
//		System.out.println(trueAndFalse);
//		System.out.println(grade);
		
		
}
