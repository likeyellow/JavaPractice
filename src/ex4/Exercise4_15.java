package ex4;
/* [4-15]
 * ������ ȸ������ ���ϴ� ���α׷��̴�. ȸ����(palindrome)��, ���ڸ� �Ųٷ�
 * �о ������ �д� �Ͱ� ���� ���� ���Ѵ�. ���� ��� '12321'�̳� '13531'����
 * ���� ���Ѵ�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
 * [Hint] ������ �����ڸ� �̿��Ͻÿ�
 * 
 */
public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			// (1)�˸��� �ڵ带 �־� �ϼ��Ͻÿ�
		
			result += number % 10;
			System.out.println(result);
			tmp = number;
		}
		if(number == result)
			System.out.println(number+"�� ȸ���� �Դϴ�. ");
		else
			System.out.println(number+"�� ȸ������ �ƴմϴ�. ");
	} // main
}
