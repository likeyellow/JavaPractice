package ex5;
/*
 * [5-4] 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� 
 * ���α׷��� �ϼ��Ͻÿ�
 */
public class Exercise5_4 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0; 
		float average = 0;
		
		int test  = 0;
		int[] test2 = {0};
	
		
	
		System.out.println("test3="+ arr.length);
		// �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
		
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j <arr[i].length; j++) {
				
				 total += arr[i][j]; 
				 
				 average = (float)total / ((arr[i].length) * (arr.length)); 
			
				 } 
			 }
		 		
		System.out.println("total= "+total);
		System.out.println("average="+average);
	} // end of main
} // end of class
