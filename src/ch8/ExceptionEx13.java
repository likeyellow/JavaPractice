package ch8;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1();
	} // main �޼����� ��
	
	static void method1() {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	} // method1�� ��
}
