package a20_�÷���;

import java.util.List;
import java.util.Scanner;


public UserArrayList() {
	in = new Scanner(System.in);
	
	}

	
	public User insertUser() {
		User user = new User();
		System.out.println("[����� �߰�]");
	
		
		System.out.println("���̵�: ");
		user.setUsername(in.nextLine());
		System.out.println("��й�ȣ: ");
		user.setPassword(in.nextLine());
		System.out.println("�̸�: ");
		user.setname(in.nextLine());
		System.out.println("�̸���: ");
		user.setEmail(in.nextLine());
		
		System.out.println("[����� �Է��� �Ϸ�Ǿ����ϴ�.]\n");
		return user;
	}
	
	public void desplayController() {
		while(true) {
			System.out.println("1. ����� �Է�");
			System.out.println("2. ����� ��ȸ");
			System.out.println("3. ����� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			String cmd = in.nextLine();
			
		if(cmd.equals("1")) {
			users.add(inserUser());	
		}else if(cmd.equals("2")) {
			
		}else if(cmd.equals("3")) {
			
		}else if(cmd.equals("q")) {
			System.out.print("���α׷� ������...\n ");
			break;
		}
	
		
		}
			
	
		
public class UserArrayList {
	public static void main(String[] args) {
		UserArrayList ual = new UserArrayList();
		ual.des
		List<User> users = new ArrayList<User>();
		
		
		
		
		for()
	}
		
	}

	
}
