package a15_�������̽�2;

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
		System.out.println("����� ���� �˻�");
		System.out.println("ã���� �ϴ� ���̵� �Է�: ");
		String searchId = in.nextLine();
		
		User user = getUser(searchId);
		
		if(user == null) {
			System.out.println("�ش� ���̵��� ����ڸ� ã�� �� �����ϴ�.");
		}else {
			System.out.println("ã�� ����� ����");
			System.out.println(user);
		}
	
	}



	
	
	
	}
