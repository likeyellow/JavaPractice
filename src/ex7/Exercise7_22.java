package ex7;

class Circle extends Shape{
	double r;	// ������
	
	Circle(double r){
		this(new Point(0,0),r); //Circle(Point p, double r)�� ȣ��
	}

	public Circle(Point p, double r) {
		super(p); // ������ ����� ������ �����ڰ� �ʱ�ȭ�ǵ��� �Ѵ�
		this.r = r;
	}

	double calcArea() {
		return r*r*(Math.PI);
	}	
}

class Rectangle extends Shape{
	double width;  // ��
	double height; // ����
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	Rectangle(Point p, double width, double height){
		super(p); // ������ ����� ������ �����ڰ� �ʱ�ȭ�ϵ��� �Ѵ�
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
	
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	
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
	
	// (1) sumArea�޼��带 �ۼ��Ͻÿ�
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("������ ��:"+sumArea(arr));

	}

}
