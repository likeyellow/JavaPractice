package ex7;

public class Exercise7_18 {

	/*(1) action �޼��带 �ۼ��Ͻÿ� */
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), 
				new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);

	} // main
}

class Robot{}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}