package ex7;

class Circle extends Shape{
	double r;	// 반지름
	
	Circle(double r){
		this(new Point(0,0),r); //Circle(Point p, double r)를 호출
	}

	public Circle(Point p, double r) {
		super(p); // 조상의 멤버는 조상의 생성자가 초기화되도록 한다
		this.r = r;
	}

	double calcArea() {
		return r*r*(Math.PI);
	}	
}

class Rectangle extends Shape{
	double width;  // 폭
	double height; // 높이
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	Rectangle(Point p, double width, double height){
		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width*height;
	}
	boolean isSquare(){
		
		//boolean result = result;
		
	//	if(width==height) {
	//		result = result;
	//	}else {
	//		result != result;
	//	}
	//	return result;
		return width*height!=0 && width==height;
	}
}

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
}

class Point{
	int x; 
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}


public class Exercise7_22 {
	
	// (1) sumArea메서드를 작성하시오
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:"+sumArea(arr));

	}

}
