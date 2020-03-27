package ch7_8;

class Card{
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڿ��� �� �ѹ��� �ʱ�ȭ �� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){ // �Ű������� �Ѱܹ��� ������
		KIND = kind; 			// KIND�� NUMBER�� �ʱ�ȭ�Ѵ�
		NUMBER = num;
	}
	Card(){
		this("HEART", 1);
	}
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		//c.NUMBER = 5;  // error
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());

	}

}