package a05_연산자;

public class Operation1 {

	public static void main(String[] args) {
//	증감연산자(증가,감소 연산자)
		
		int score = 50;
		score = score +1;
		score += 1;
//		^위 두줄 같은 뜻
		
		
     System.out.println(score); 
     System.out.println(++score);
     System.out.println(score);
//    ^ 그대로 값이 저장됨
     System.out.println(score++ +","+score);
//     ^증가 안됨
     System.out.println(score);
     System.out.println(--score);
     System.out.println(score);
     System.out.println(score--);
     System.out.println(score);
     
     
     
     
     
     
     
     
	}

}
