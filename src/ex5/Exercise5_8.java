package ex5;
/*
 * [5-8] ������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ
 * '*' �� �� �׷����� �׸��� ���α׷��̴�. 
 * (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
 */
public class Exercise5_8 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 2, 1, 4, 4, 2, 1, 2, 2};
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length; i++) {
			// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			for(int j = 0; j < counter.length; j++) {
				if(answer[i] == counter[j]) {
					counter[j] ++;
				}
			}
			
		}
		for(int i=0; i < counter.length; i++) {
			// (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
			counter[i] += 1;
			
			System.out.println();
			System.out.printf("%d : %d", i, counter[i]);
		}
	} // end of main
} // end of class
