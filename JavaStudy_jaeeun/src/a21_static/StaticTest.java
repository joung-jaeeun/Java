package a21_static;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data

class User {
	public User() {
		id += (++autoId);
	}
	public User(String username, String password, String name, String email) {
		super();
		id += (++autoId);
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	private static int autoId;
	private static int id= 20210000; //기울어져있는 거 다static
	private String username;
	private String password;
	private String name;
	private String email;
	
}

public class StaticTest {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		User user1 = new User("junil","1234","김준일","jjo2379@naver.com");
		User user2 = new User("junil","1234","김준일","jjo2379@naver.com");
		User user3 = new User("junil","1234","김준일","jjo2379@naver.com");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
	//생성될 때마다 1씩 증가되게
	}

}


