package a10_클래스;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCompany("자동차 테스트");
		
		String company = c1.getCompany();
		
		System.out.println(company);

	}

}