package ex4;
/* [4-8] 
 * ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�.
 * ��, x�� y�� �����̰� ������ ������ 
 * 0<=x<=10, 0<=y<=10 �̴�.
 * 
 */
public class Exercise4_8 {
	public static void main(String[] args) {
		int x, y = 0;
		int result = 0;
		
		for(x = 0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				
				result = 2*x+4*y;
				if(result == 10) {
					System.out.println("x :"+x+"y :"+y);
				}
			}
		}

	}

}
