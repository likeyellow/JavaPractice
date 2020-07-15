package ex4;
/* [4-8] 
 * 방정식 2x+4y=10의 모든 해를 구하시오.
 * 단, x와 y는 정수이고 각각의 범위는 
 * 0<=x<=10, 0<=y<=10 이다.
 * 
 */
public class Exercise4_8 {
	public static void main(String[] args) {
		int x, y = 0;
		int result = 0;
		
		for(x = 0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				
				result = 2*x+4*y;
				if(result == 10) {
					System.out.println("x :"+x+"y :"+y);
				}
			}
		}

	}

}
