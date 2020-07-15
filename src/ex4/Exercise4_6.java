package ex4;
/*
 * [4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
 * 출력하는 프로그램을 작성하시오
 */
public class Exercise4_6 {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		int sum = dice1+dice2;
		
		
		if(sum==6) {
			System.out.println("주사위1 :"+dice1);
			System.out.println("주사위2 :"+dice2);
			System.out.println("두 주사위의 합: "+ sum);
		}
	}

}
