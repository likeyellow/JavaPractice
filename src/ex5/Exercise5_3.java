package ex5;
/* [5-3] �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
 */


public class Exercise5_3 {
	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int sum2 = 0;
		// �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
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
