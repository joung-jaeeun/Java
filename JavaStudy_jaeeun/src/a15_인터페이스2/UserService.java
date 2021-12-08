package a15_인터페이스2;

import java.util.Arrays;

public class UserServiceImpl implements UserService  {
	private User[] users;

	
	
	public User[] getUsers(String id) {
		int index = 0;
		
		for(int i = 0; i<users.length; i++) {
			if(users[i] == null || !users[i].getId().equals(id)) {
				continue;
			}
			return users[i]
		}
		
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serchUser() {
		System.out.println("사용자 정보 검색");
		System.out.println("찾고자 하는 아이디 입력: ");
		String searchId = in.nextLine();
		
		User user = getUser(searchId);
		
		if(user == null) {
			System.out.println("해당 아이디의 사용자를 찾을 수 없습니다.");
		}else {
			System.out.println("찾은 사용자 정보");
			System.out.println(user);
		}
	
	}



	
	
	
	}
