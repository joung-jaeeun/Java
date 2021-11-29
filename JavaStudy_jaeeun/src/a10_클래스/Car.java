package a10_클래스;

public class Car {
	//레퍼런스 변수(참조 변수)
	private String company; //제조사
	private String model;//모델명
	private String color;//색상
	private int year;//연식
	
	
	
//getter(가져올 때) && setter(값을 대입)
	public void setCompany(String company) {
		this.company = company;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCompany() {
		return company;
	}
	
	public void carInfo() {
		System.out.println(company + " , " + model + " , " + color + " , " + year);
		
		
			
	}
	
	
	
	
	

}
