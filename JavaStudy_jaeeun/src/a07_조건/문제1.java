package a07_����;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է����ּ���(0~100):");
		
		int score = input.nextInt();
		

		if ( score > 100 || score < 0) {
			System.out.println("�߸��� �����Դϴ�.");
		
		}
		
//		90~100 A
		else if (score > 89) {
			System.out.println("A");
			
			}
//		80~89  
		
		else if (score > 79) {
			System.out.println("B");
			}
//		70~79  C
		else if (score > 69) {
			System.out.println("C");
			}
//		60~69  D
		else  if (score > 59) {
			System.out.println("D");
			}
//		0~59  F
		else  {
			System.out.println("F");
		
		}
		
		
		
		
		



	

	
	}
}
	

