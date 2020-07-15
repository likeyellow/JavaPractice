package ex5;
/* [5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
 */


public class Exercise5_3 {
	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int sum2 = 0;
		// 알맞은 코드를 넣어 완성하시오.
		
		// 1)
		for(int num : arr) {
			sum += num;
		}
		System.out.println("sum="+sum);
		
		// 2)
		for(int i=0; i<arr.length; i++) {
			
			sum2 += arr[i];
		}
		System.out.println("sum2="+sum2);
		
		
	}

}
