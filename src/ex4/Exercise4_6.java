package ex4;
/*
 * [4-6] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� 
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
public class Exercise4_6 {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		int sum = dice1+dice2;
		
		
		if(sum==6) {
			System.out.println("�ֻ���1 :"+dice1);
			System.out.println("�ֻ���2 :"+dice2);
			System.out.println("�� �ֻ����� ��: "+ sum);
		}
	}

}
