package ch8;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		}catch(Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}// main�� ��
	
	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�. */
	}
	static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´� */ }
	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */ }
}
