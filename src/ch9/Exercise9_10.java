package ch9;

public class Exercise9_10 {
	
	/* (1) format 메서드를 작성하시오.
	 * 1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
	 * 2. 1의 경우가 아니면, lenght크기의 char배열을 생성하고 공백으로 채운다.
	 * 3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
	 *		(System.arraycopy()사용)
	 * 4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다. 
	 */
	public static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(length < str.length()) 
			return str.substring(0, length);
	
		
			//char[] ch = new char[length];
			char[] ch = str.toCharArray(); // 문자열을 char배열로 변환
			char[] result = new char[length];
			for(int i =0; i<result.length; i++) {
				result[i] = ' '; // 배열 result를 공백으로 채운다.				
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
		String str = "가나다";
		
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬

	}

}
