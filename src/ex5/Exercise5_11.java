package ex5;
/*
 * [5-11] �־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ�
 * �迭 ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷��̴�.
 * (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
 * 
 */
public class Exercise5_11 {
	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		

		int [][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
				
				result[i][j] = score[i][j];
				
				result[i][3] += score[i][j];
				result[5][j] += score[i][j];
					
				
				
			}
		}
		
		for(int i=0; i < result.length; i++) {
			for(int j=0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	} // main
}
