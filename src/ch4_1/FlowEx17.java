package ch4_1;

import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("*�� ����� ������ ���� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		//num = sc.nextInt();
		num = Integer.parseInt(tmp);	// �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // main�� ��
}