package a15_�������̽�2;


public class UserController {

	public static void main(String[] args) {
		int uesrCount = 10;
		UserService userService = new UserServiceImpl(userCount);
		userService.creatUser();
		
		System.out.println("��ü ���� ���� ��� -> ");
		userService.printUsers();
		
		userService.searchUsers();
		
	
		}

	}

}
