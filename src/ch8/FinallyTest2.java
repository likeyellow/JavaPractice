package ch8;

public class FinallyTest2 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		} // try-catch의 끝
	} // main의 끝
	
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
