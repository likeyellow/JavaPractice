package ex4;
/*
 * [4-7] Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� 
 * �����ϴ� �ڵ带 �ϼ��϶�. (1)�� �˸��� �ڵ带 �����ÿ�.
 */
public class Exerciser4_7 {
	public static void main(String[] args) {
		int value = (int)(Math.random()*6)+1;
		
		System.out.println("value:"+ value);

	}

}
