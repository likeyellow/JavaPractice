package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // Exception 발생
			System.out.println(4);  // 실행되지 않음
		}catch(Exception e) {
			System.out.println(5);
		} // try-catch의 끝
		System.out.println(6);
	}
}
