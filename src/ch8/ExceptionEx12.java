package ch8;

public class ExceptionEx12 {

	public static void main(String[] args)throws Exception {
		method1(); // ���� Ŭ������ static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��

	}
	static void method1() throws Exception{
		method2();
	} // method1�� ��
	static void method2() throws Exception{
		throw new Exception();
	}// method2�� ��

}
