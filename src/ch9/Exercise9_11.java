package ch9;

import java.util.Scanner;

public class Exercise9_11 {

	public static void main(String[] args) {
		
		
		int input1, input2;
		int k;
		
		try {
			if()
		System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է��� �ּ���.");
		System.out.println("USAGE : GugudanTest 3 5");
		
		
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		if(input1 < 3 || input2 > 9) {
			System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			System.out.println("USAGE : GugudanTest 3 5");
		}
		
		for(int i = input1; i<=input2; i++) {
			for(int j=1; j<10; j++) {
				k = i * j;
				System.out.println(i+"*"+j+"="+k);
			}
			System.out.println();
		}
			
		
			
		

	}

}
