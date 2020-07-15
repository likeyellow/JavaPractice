package ex4;

public class Exercise4_6_3 {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5, 6};
		int[] num2 = {1, 2, 3, 4, 5, 6};
		
		int sum = 0;
		
		for(int i : num1) {
			for(int j : num2) {
				if((i+j)==6) {
					sum= i+j;
					System.out.println("주사위1: "+i+" 주사위2: "+j+" 합: "+sum);
				}
			}
		}
		

	}

}
