package ex7;

class Outer{
	class Inner{
		int iv=100;
	}
}
public class Exercise7_25 {

	public static void main(String[] args) {
		
		// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		Outer ot = new Outer();
		Outer.Inner ii = ot.new Inner();
		System.out.println(ii.iv);

	}

}
