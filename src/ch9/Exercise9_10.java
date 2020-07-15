package ch9;

public class Exercise9_10 {
	
	/* (1) format �޼��带 �ۼ��Ͻÿ�.
	 * 1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
	 * 2. 1�� ��찡 �ƴϸ�, lenghtũ���� char�迭�� �����ϰ� �������� ä���.
	 * 3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
	 *		(System.arraycopy()���)
	 * 4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�. 
	 */
	public static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(length < str.length()) 
			return str.substring(0, length);
	
		
			//char[] ch = new char[length];
			char[] ch = str.toCharArray(); // ���ڿ��� char�迭�� ��ȯ
			char[] result = new char[length];
			for(int i =0; i<result.length; i++) {
				result[i] = ' '; // �迭 result�� �������� ä���.				
			}
			
		switch(alignment) {
			case 0 :
				default:
				System.arraycopy(ch, 0, result, 0, ch.length);
			case 1 :
				System.arraycopy(ch, 0, result, diff/2, ch.length);
				break;
			case 2 :	
				System.arraycopy(ch, 0, result, diff, ch.length);
				break;
			
		}
		return new String(result);
		
	}
	
	
	public static void main(String[] args) {
		String str = "������";
		
		System.out.println(format(str, 7, 0)); // ���� ����
		System.out.println(format(str, 7, 1)); // ��� ����
		System.out.println(format(str, 7, 2)); // ������ ����

	}

}
