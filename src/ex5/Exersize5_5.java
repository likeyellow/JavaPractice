package ex5;
/*
 * [5-5] ������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ�
 * ������ ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
 */
public class Exersize5_5 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// �迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�.
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
			// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		
			
		}
		System.out.println();
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�
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
