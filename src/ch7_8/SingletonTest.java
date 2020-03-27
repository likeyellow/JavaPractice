package ch7_8;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() { // 생성자가 private 인 클래스는 
		// ....           // 다른 클래스의 조상이 될 수 없다
	}
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		 //Singleton s = new Singleton();  // 에러
		Singleton s = Singleton.getInstance();
	}

}
