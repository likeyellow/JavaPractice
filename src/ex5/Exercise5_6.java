package ex5;
/*
 * [5-6] ������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�.
 * ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� 
 * ����϶�. ��, ������ �� ���� ���� �������� �Ž��� �־�� �Ѵ�.
 * (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
 * 
 * [Hint] ������ �����ڿ� ������ �����ڸ� ����ؾ� �Ѵ�.
 */
public class Exercise5_6 {
	
	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+ money);
		
		int rest500 = 0, rest100 = 0, rest50 = 0, rest10 = 0;
		int restAll = 0;
		
		
		
		for(int i = 0; i < coinUnit.length; i++) {
			// (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			
			//if(money)
			rest500 = money / coinUnit[0];
			restAll = money - (rest500 * coinUnit[0]);
			
			rest100 = restAll / coinUnit[1];
			restAll = restAll - (rest100 * coinUnit[1]);
			
			
			rest50 = restAll / coinUnit[2];
			restAll = restAll - (rest50 * coinUnit[2]);
			
			rest10 = restAll / coinUnit[3];
			
			
			
			
		}
		//System.out.println("test : " + restAll);
		
		System.out.println("500��: " + rest500);
		System.out.println("100��: " + rest100);
		System.out.println("50��: " + rest50);
		System.out.println("10��: " + rest10);

	} // main

}
