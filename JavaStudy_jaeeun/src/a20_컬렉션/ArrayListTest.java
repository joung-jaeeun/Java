package a20_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		
		arrayList.add("김준일");
		arrayList.add("김준이");
		arrayList.add("김준삼");
		arrayList.add("김준사");
		arrayList.add("김준오");
		arrayList.add("김준육");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		//get은 값만 가져옴
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		//remove는 값도 없애고 배열도 함, 값이 없어지면 남아있는 값이 땡겨짐
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		
		
	}

}
