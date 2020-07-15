package ex7;

class Outer2{
	static class Inner{
		int iv=200;
	}
}
public class Exercise7_26 {
	public static void main(String[] args) {
		// (1) 알맞은 코드를 넣어 완성하시오.
	//	Outer2 o = new Outer2();
		Outer2.Inner ii = new Outer2.Inner();
		System.out.println(ii.iv);

	}

}
