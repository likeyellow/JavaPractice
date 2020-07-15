package ex4;
/*
 * [4-5] 다음을 for문을 while문으로 변경하시오.
 * public class Exercise4_5 {
 * 	public static void main(String[] args) {
 * 		for(int i=0; i<=10; i++){
 * 			for(int j=0; j<=i; j++)
 * 				System.out.print("*");
 * 			System.out.println();
 * 		} 
 * 	} // end of main
 * } // end of class
 */
public class Exercise4_5 {
	public static void main(String[] args) {
		int [][] arr = new int [10][10];
		
		int i = 0;
	  //int j = 0;
		while(i <= 10) {
			//	i++;
			//	j++;
			int j = 0;
			while(j <=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
