package a20_�÷���;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		
		arrayList.add("������");
		arrayList.add("������");
		arrayList.add("���ػ�");
		arrayList.add("���ػ�");
		arrayList.add("���ؿ�");
		arrayList.add("������");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		//get�� ���� ������
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		//remove�� ���� ���ְ� �迭�� ��, ���� �������� �����ִ� ���� ������
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		
		
	}

}
