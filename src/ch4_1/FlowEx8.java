package ch4_1;
import java.util.*;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���(011231-1111222)>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7);	// �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
		
		switch(gender) {
		case '1': case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2': case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
		}

	} // main�� ��
}
