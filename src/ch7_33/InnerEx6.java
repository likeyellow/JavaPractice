package ch7_33;

public class InnerEx6 {
	Object iv = new Object() {void method(){} }; // �͸� Ŭ����
	static Object cv = new Object() {  // �͸� Ŭ����
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() {void method(){} }; // �͸� Ŭ����
	}
	

	public static void main(String[] args) {

	}

}
