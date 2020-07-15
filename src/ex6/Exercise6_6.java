package ex6;
/* [6-6]
 * 두 점의 거리를 계산하는 getDistance()를 완성하시오.
 * [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
 * 
 */

public class Exercise6_6 {
	// 두 점 (x,y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
	// 인스턴스와 관계가 없으므로(인스턴스변수를 사용 안 했으니까) static메서드로 선언가능
	// (1) 알맞은 코드를 넣어 완성하시오.
		
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
