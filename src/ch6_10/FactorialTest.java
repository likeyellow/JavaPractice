package ch6_10;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}

	private static int factorial(int n) {
		int result = 0;
		if(n==1)
			result = 1;
		else
			result = n * factorial(n-1); // �ٽ� �޼��� �ڽ��� ȣ���Ѵ�
		return result;
	}

}
