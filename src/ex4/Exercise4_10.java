package ex4;
/* [4-10] intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� �����
 * ����ϴ� �ڵ带 �ϼ��϶�. ���� ���� num�� ���� 12345���, 
 * '1+2+3+4+5'�� ����� 15�� ����϶�
 * (1)��  �˸��� �ڵ带 �����ÿ�.
 * [����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
 * 
 * 
 */
public class Exercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		while(num > 0) {
			sum+=num%10;
			num /= 10;
			System.out.println("sum="+sum);
		}
	}
		
}
