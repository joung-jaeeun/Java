package a08_�ݺ�;

public class DoubleLoop {

	public static void main(String[] args) {
		int i = 1;

		while(i < 11) {
			System.out.println( i+1 + "�� ° ����");
			int j = 1;
//			�� ������ j�� 1�� �ٲ���
			while(j < 6) {
				System.out.println("�ڳ�����" + j + "�� °");
				j++;
			}
			i++;	
		}
//		System.out.println(j); �������� j�� while�� �ȿ����� ��� �����ϴ�. 
	}

}
