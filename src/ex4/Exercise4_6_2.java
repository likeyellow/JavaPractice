package ex4;

import java.util.Arrays;

/*
 * [4-6] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� 
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
public class Exercise4_6_2 {
	public static void main(String[] args) {
		int[] dice1 = {1,2,3,4,5,6};
		int[] dice2 = {1,2,3,4,5,6};
		int sum = 0;
		int result = 0;
		
		for(int i=0; i<dice1.length; i++) {
			for(int j=0; j<dice2.length; j++) {
				
				sum = dice1[i] + dice2[j];
				if(sum==6) {
					
					System.out.println(sum);
					System.out.println("dice1:"+dice1[i]+", dice2:"+dice2[j]);
				}
			}
		}

	}

}
