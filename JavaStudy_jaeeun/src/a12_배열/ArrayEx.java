package a12_�迭;

/**
 * 
 * 
 * �迭(Array)
 * ���� �ڷ��� �Ǵ� ��ü���� ���� �� ����.
 * �迭�� Ű����
 * index(�ε���)  -> ������ ��ȣǥ�� -> [] ���ȣ
 * 
 * @author ITPS
 *
 */




public class ArrayEx {
	
	public static void main(String[] arg) {
		//�ڷ���[] �迭�� =  new �ڷ���[�迭�� ũ��];
		//int[] num = new int[5];
		//��		��	��	��	��	
		//0		1	2	3	4
		
		int[] num = new int[50]; 
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		
		
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		
		
		
		for(int i = 0; i< num.length; i++) {
			num[i] = 10*(i + 1); 
		}
		
		for(int i =0; i<num.length; i++ ) {
			System.out.println(num[i]);
		}
		
		
		
		
		
	}
}
