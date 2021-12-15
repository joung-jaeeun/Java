package a20_�÷���;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, User> userMap = new HashMap<String, User> ();
		
		
		userMap.put("jjo23791",new User("jjo2379","1234","������","jjo2379@naver.com"));
		userMap.put("jjo23792",new User("jjo2379","1234","������","jjo2379@naver.com"));
		userMap.put("jjo23793",new User("jjo2379","1234","������","jjo2379@naver.com"));
		userMap.put("jjo23794",new User("jjo2379","1234","������","jjo2379@naver.com"));
		userMap.put("jjo23795",new User("jjo23792","4321","������2","jjo2379@naver.com"));
		userMap.replace("jjo23795", new User("jjo23793","1234","������","jjo2379@naver.com" ));
		
		
		String username = "jjo23792";
		
		Set<String> keySet = userMap.keySet();
		System.out.println(keySet);
		
		Iterator<String> ir = keySet.iterator();
		
		while(ir.hasNext()) {
			User user = userMap.get(ir.next());
			
			
			if(user.getUsername().equals(username)) {
				System.out.println();
			}
		}
		
		System.out.println(userMap);
		
		
	}

}
