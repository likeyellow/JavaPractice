package ex6;

public class Exercise6_8 {
	
	

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
		// �������� card, args
	}
}

class PlayingCard{
	int kind; // �ν��Ͻ�����
	int num;  // �ν��Ͻ�����
	
	static int width;  // Ŭ��������(static ����)
	static int height; // Ŭ��������(static ����)
	
	PlayingCard(int k, int n){ // ��������
		kind = k; // ��������(k, n)
		num = n;  // �ν��Ͻ�����
	}
}
