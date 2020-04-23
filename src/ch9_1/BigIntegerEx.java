package ch9_1;

import java.math.*;

public class BigIntegerEx {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<100; i++) { // 1!���� 99!���� ���
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(300); // 0.3���� ����
		}
	}
	static BigInteger calcFactorial(int n) {
		return factorial(BigInteger.valueOf(n));
	}
	static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else // return n * factorial(n-1);
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}