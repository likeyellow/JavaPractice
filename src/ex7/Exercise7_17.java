package ex7;
/* [7-17] �Ʒ� �� ���� Ŭ�����κ��� ����κ��� �̾Ƽ� Unit�̶�� Ŭ������
 * �����, �� Ŭ������ ��ӹ޵��� �ڵ带 �����Ͻÿ�
 * 
 */
abstract class Unit{
	int x, y; // ����
	abstract void move(int x, int y); // �߻�Ŭ����
	void stop() {}
	
}
class Marine extends Unit{ //����
//	int x, y; // ���� ��ġ
	void move(int x, int y) {/* ������ ��ġ�� �̵� */}
//	void stop() { /* ���� ��ġ�� ���� */}
	void stimPack() {/* �������� ����Ѵ�. */}
}
class Tank extends Unit{ //��ũ
//	int x, y; // ���� ��ġ
	void move(int x, int y) {/* ������ ��ġ�� �̵� */}
//	void stop() { /* ���� ��ġ�� ���� */}
	void changeMode() {/* ���ݸ�带 ��ȯ�Ѵ�. */}
}
class Dropship extends Unit{ // ���ۼ�
//	int x, y; // ���� ��ġ
	void move(int x, int y) {/* ������ ��ġ�� �̵� */}
//	void stop() { /* ���� ��ġ�� ���� */}
	void load() { /* ���õ� ����� �¿�� */}
	void unload() {/* ���õ� ����� ������  */}
}

public class Exercise7_17 {
	public static void main(String[] args) {
		

	}

}
