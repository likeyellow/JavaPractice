package ex4;
/*[4_14] ������ ���ڸ��߱� ������ �ۼ��� ���̴�. 1�� 100������ ���� �ݺ�������
 * �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������. ����ڰ� ���� �Է��ϸ�,
 * ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
 * ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� �������
 * �˷��ش�. (1)~(2)�� �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
 */
public class Exerciser4_14 {
	public static void main(String[] args) {
		
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = /*(1)*/ (int)(Math.random()*100)+1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		
		// ȭ�����κ��� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = sc.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.
			
			// (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			if(answer > input) {
				System.out.println("�� ū���� �Է��ϼ���!");
			}else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���!");
			}else {
				System.out.println("�����Դϴ�!");
				System.out.println("��ǻ���� ��: "+answer+", ������� ��: "+input);
				System.out.println(count +" ������ ������ ������ϴ�.");
				break;
			}
		}while(true); // ���ѹݺ���
	} // end of main
} // end of class HighLow
