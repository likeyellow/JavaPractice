package ex6;
/* [6-2]
 * 문제6-1에서 정의된 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * 
 */
public class Exercise6_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}
}

class SutdaCard{
	// (1) 알맞은 코드를 넣어 완성하시오.
	int num;
	boolean isKwang;
	
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang? "K" : "");
	}
}