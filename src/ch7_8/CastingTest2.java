package ch7_8;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // �������� OK. ���� �� ������ �߻� 
		car2 = fe;            // ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� ���� �� �� 
		car2.drive();         // Car car = new Car(); -> Car car = new FireEngine();
		                      // �ٲٸ� ���� �ذ�
	}

}
