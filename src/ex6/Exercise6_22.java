package ex6;

public class Exercise6_22 {
	// (1) isNumber메서드를 작성하시오.
	public static boolean isNumber(String str) {
		if(str==null || str.contentEquals(""))
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char result = str.charAt(i);
			
			if(result < '0' || result > '9') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}

}
