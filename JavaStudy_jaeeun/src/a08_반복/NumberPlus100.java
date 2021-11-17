package a08_반복;

public class NumberPlus100 {
	public static void main(String[] args) {
		int number = 1;
		int result = 0;
//		*
//	
//		result += number++;
//		result += number++;
//		result += number++;
//		result += number++;
//		result += number++;
//		result += number++;

		
		
		for(int i = 0; i <100; i++) {
			result +=number++;
		}
//		i라는 변수에 0이 들어가있음,그다음 true냐 false냐(답:true). 조건이 true이면 반복을 해라
		
		
		
		System.out.println(result);
	}

}
