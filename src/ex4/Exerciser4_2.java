package ex4;
/*
 * [4-2] 1~20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
 * 
 */
public class Exerciser4_2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < 20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
			}
		}
		System.out.println("2 또는 3의 배수가 아닌 수의 총합 : "+sum);

	}

}
