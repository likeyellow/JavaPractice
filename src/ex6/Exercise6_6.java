package ex6;
/* [6-6]
 * �� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�.
 * [Hint] ������ ����� Math.sqrt(double a)�� ����ϸ� �ȴ�.
 * 
 */

public class Exercise6_6 {
	// �� �� (x,y)�� (x1, y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
	// �ν��Ͻ��� ���谡 �����Ƿ�(�ν��Ͻ������� ��� �� �����ϱ�) static�޼���� ���𰡴�
	// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
