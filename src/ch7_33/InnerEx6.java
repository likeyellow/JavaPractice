package ch7_33;

public class InnerEx6 {
	Object iv = new Object() {void method(){} }; // 익명 클래스
	static Object cv = new Object() {  // 익명 클래스
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() {void method(){} }; // 익명 클래스
	}
	

	public static void main(String[] args) {

	}

}
