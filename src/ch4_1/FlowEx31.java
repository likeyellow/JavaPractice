package ch4_1;

public class FlowEx31 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;	// break�� �޸� �ݺ����� ����� �ʰ� ���ǽ��� ���̸� ���� ������ �̵�
			System.out.println(i);
		}

	}

}
