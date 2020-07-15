package ex6;

public class Exercise6_8 {
	
	

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
		// 지역변수 card, args
	}
}

class PlayingCard{
	int kind; // 인스턴스변수
	int num;  // 인스턴스변수
	
	static int width;  // 클래스변수(static 변수)
	static int height; // 클래스변수(static 변수)
	
	PlayingCard(int k, int n){ // 지역변수
		kind = k; // 지역변수(k, n)
		num = n;  // 인스턴스변수
	}
}
