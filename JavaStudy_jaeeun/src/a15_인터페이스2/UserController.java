package a15_인터페이스2;


public class UserController {

	public static void main(String[] args) {
		int uesrCount = 10;
		UserService userService = new UserServiceImpl(userCount);
		userService.creatUser();
		
		System.out.println("전체 유저 정보 출력 -> ");
		userService.printUsers();
		
		userService.searchUsers();
		
	
		}

	}

}
