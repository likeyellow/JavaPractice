package ex7;
/* [7-14] 
 * ���� 7-1�� ������ ����ī���� ���ڿ� ����(isKwang)�� ��� �ѹ� ���� �����Ǹ�
 * ����Ǿ�� �� �Ǵ� ���̴�. ī���� ���ڰ� �ѹ� �߸� �ٲ�� �Ȱ��� ī�尡 ���� ��
 * ���� �ֱ� �����̴�. �̷��� �������� �߻����� �ʵ��� �Ʒ��� SutdaCard�� �����Ͻÿ�.
 * 
 */
class SutdaCard3{
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard3(){
		this(1, true);
	}
	SutdaCard3(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	public String toString() {
		return NUM + (IS_KWANG ? "K":"");
	}
}

public class Exercise7_14 {
	public static void main(String args[]) {
		SutdaCard3 card = new SutdaCard3(1, true);
	}


}
