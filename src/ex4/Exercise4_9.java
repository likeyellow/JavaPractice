package ex4;
/* [4-9] 
 * ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� �����
 * ����ϴ� �ڵ带 �ϼ��϶�. ���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15��
 * ��µǾ�� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�
 * [Hint] StringŬ������ charAt(int i)�� ���
 * 
 */
public class Exercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			sum += str.charAt(i)-'0';
		}
		
		System.out.println("sum="+sum);

	}

}
