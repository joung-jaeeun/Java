package a20_�÷���;


	
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {
	
	public static void main(String[] args) {
		Set<User> userSet = new  HashSet<User>();
		
		userSet.add(new User("junil1", "1234", "������1", "jjo2379@naver.com"));
		userSet.add(new User("junil2", "1234", "������2", "jjo2379@naver.com"));
		userSet.add(new User("junil3", "1234", "������3", "jjo2379@naver.com"));
		userSet.add(new User("junil4", "1234", "������4", "jjo2379@naver.com"));
		userSet.add(new User("junil5", "1234", "������5", "jjo2379@naver.com"));
		userSet.add(new User("junil6", "1234", "������6", "jjo2379@naver.com"));
		
		Iterator<User> ir = userSet.iterator();
		
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
		
		
		System.out.println(userSet);
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		strSet.add("������");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
	}
	

}
