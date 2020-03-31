package ch7;

public class InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();

	}
}
class A{
	void methodA() {
		I i = InstanceManager.getInstance(); // ��3�� Ŭ������ �޼��带 ���ؼ� 
		i.methodB();                         // �������̽� I�� ������ Ŭ������
		                                     // �ν��Ͻ��� ���´�
		
		System.out.println(i.toString()); // i�� ObjectŬ������ �޼��� ȣ�Ⱑ��
	}
}
interface I{
	public abstract void methodB();
}
class B implements I{
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {return "class B";}
}
class InstanceManager{
	public static I getInstance() {
		return new B();
	}
}