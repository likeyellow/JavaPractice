package ch7_8;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // 컴파일은 OK. 실행 시 에러가 발생 
		car2 = fe;            // 조상타입의 인스턴스를 자손타입의 참조변수로 참조 안 됨 
		car2.drive();         // Car car = new Car(); -> Car car = new FireEngine();
		                      // 바꾸면 에러 해결
	}

}
