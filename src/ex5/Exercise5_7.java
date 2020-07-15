package ex5;

import java.util.Scanner;

/*
 * [5-7] ���� 5-6�� ������ ������ �߰��� ���α׷��̴�. Ŀ�ǵ�������κ��� �Ž��� �� 
 * �ݾ��� �Է¹޾� ����Ѵ�. ������ ������ ������ �Ž������� ������ �� ������,
 * '�Ž������� �����մϴ�.'��� ����ϰ� �����Ѵ�.
 * ������ ���� ����� ������, �Ž������� ������ ��ŭ ���� ������ ���� ���� 
 * ������ ������ ȭ�鿡 ����Ѵ�. (1)�� �˸��� �ڵ带 �־
 * ���α׷��� �ϼ��Ͻÿ�.
 *
 */
public class Exercise5_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt(); 
		if(sc.hasNextInt() == false ) {
			//System.exit(0);
			System.out.println("���ڸ� �Է��� �ּ���");
		}
		// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = sc.nextInt();
		
		int[] coinUnit = {500, 100, 50, 10}; // ������ ����
		int[] coin     = {5, 5, 5, 5}; // ������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			/* (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
			 * 1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
			 * 2. �迭 coin���� coinNum��ŭ�� ������ ����.
			 * (���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			 * 3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			 */
		
			coinNum = money / coinUnit[i];
				
				while(coinNum > coin[i]) {
					coinNum = coin[i];
					coin[i] = coin[i];
					money = money - (coinUnit[i] * coinNum);
					continue;
			}
				
		
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷��� �����Ѵ�.
		}
		
		System.out.println("=���� ������ ����=");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��:"+coin[i]);
		}

	} // main
}
