package ex5;
/*
 * [5-9] 주어진 배여를 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오
 * 
 */

public class Exercise5_9 {
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i < star.length; i++) {
			for(int j=0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < star.length; i++) {
			for(int j=0; j < star[i].length; j++) {
			// (1) 알맞은 코드를 넣어 완성하시오.
				
				//result[][] = star[star]
		}
	}
		
		for(int i=0; i < result.length; i++) {
			for(int j=0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	} // end of main
} // end of class
