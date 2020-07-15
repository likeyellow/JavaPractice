package ex5;
/*
 * [5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를
 * 만들어내는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 */
public class Exersize5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다.
		for(int x=0; x < 20; x++) {
			int i = (int)(Math.random() * ballArr.length);
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			//System.out.printf("%d",  i);
			//System.out.printf("%d",  j);
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
			
			//System.out.print(ballArr[i]);
			System.out.printf("i=%d j=%d ,", ballArr[i], ballArr[j]);

			
			
			//System.out.println("========");
			// (1) 알맞은 코드를 넣어 완성하시오.
		
			
		}
		System.out.println();
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		// (2)
		//for(int num : ballArr){
		//	System.arraycopy(ballArr, i, j, destPos, length);
	//	}
		for(int i=0; i < 3; i++) {
			ball3[i] = ballArr[i];
			
		}
		
		// for(int i=0; i <3; i++){
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		for(int i =0; i<3; i++) {
			//System.out.println("==========");
			System.out.print(ball3[i]);
		}
		System.out.println();
		System.out.println("=========");
		
		for(int i=0; i < ball3.length; i++) {
			System.out.print(ball3[i]);

		} // end of main
	} // end of class

}
