package ex4;
/*
 * [4-2] 1~20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
 * 
 */
public class Exerciser4_2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < 20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
			}
		}
		System.out.println("2 �Ǵ� 3�� ����� �ƴ� ���� ���� : "+sum);

	}

}
