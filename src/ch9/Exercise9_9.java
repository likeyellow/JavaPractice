package ch9;

public class Exercise9_9 {
	
	public static String delChar(String str, String target) {
		
		return "";
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
	+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2   3  4\t5)"+" -> " 
	+delChar("(1 2   3  4\t5)"," \t"));

	}

}
