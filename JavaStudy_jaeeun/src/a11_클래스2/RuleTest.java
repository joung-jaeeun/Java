package a11_Ŭ����2;
/**
 * 
 * 
 * @author ITPS 
 *
 */

public class RuleTest {

	public static void main(String[] args) {
		Rule rule = new Rule();
		
		String name = "������"; 
		String addr = "�λ걤���� ������"; 
		int year = 2021;
		
		if(rule.isEmpty(name)) {
			System.out.println("�̸��� ����ֽ��ϴ�.");
		}else {
			System.out.println("������� �̸��� " + name + "�Դϴ�.");
		}
		
		if(rule.isEmpty(addr)) {
			System.out.println("�ּҰ� ����ֽ��ϴ�.");
		}else {
			System.out.println("������� �ּҴ� " + addr + "�Դϴ�.");
		}
		
		if(rule.isEmpty(year)) {
			System.out.println("�⵵�� �Է��� �ּ���.");
		}else {
			System.out.println("�Է��� �⵵�� " + year + "�� �Դϴ�.");
		}

	}

}
