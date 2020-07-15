package ex5;
/*
 * [5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 
 * 출력하라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
 * (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 * 
 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
 */
public class Exercise5_6 {
	
	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+ money);
		
		int rest500 = 0, rest100 = 0, rest50 = 0, rest10 = 0;
		int restAll = 0;
		
		
		
		for(int i = 0; i < coinUnit.length; i++) {
			// (1) 알맞은 코드를 넣어 완성하시오.
			
			//if(money)
			rest500 = money / coinUnit[0];
			restAll = money - (rest500 * coinUnit[0]);
			
			rest100 = restAll / coinUnit[1];
			restAll = restAll - (rest100 * coinUnit[1]);
			
			
			rest50 = restAll / coinUnit[2];
			restAll = restAll - (rest50 * coinUnit[2]);
			
			rest10 = restAll / coinUnit[3];
			
			
			
			
		}
		//System.out.println("test : " + restAll);
		
		System.out.println("500원: " + rest500);
		System.out.println("100원: " + rest100);
		System.out.println("50원: " + rest50);
		System.out.println("10원: " + rest10);

	} // main

}
