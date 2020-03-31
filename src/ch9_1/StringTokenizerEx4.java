package ch9_1;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {

	public static void main(String[] args) {
		String input = "��ʸ���õ��ʿ�";
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}
	public static long hangulToNum(String input) { // �ѱ��� ���ڷ� �ٲٴ� �޼���
		long result = 0; // ���� ��ȯ����� �����ϱ� ���� ����
		long tmpResult = 0; // ���õ ������ ���� �����ϱ� ���� �ӽú���
		long num = 0;
		
		final String NUMBER = "�����̻�����ĥ�ȱ�";
		final String UNIT = "�ʹ�õ������";
		final long[] UNIT_NUM = {10,100,1000,10000,100000,1000000};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int check = NUMBER.indexOf(token); // ��������, ����(unit)���� Ȯ���Ѵ�
			
			if(check==-1) { // ������ ���
				if("������".indexOf(token)==-1) {
					tmpResult += (num!=0 ? num : 1)
							* UNIT_NUM[UNIT.indexOf(token)];
				}else {
					tmpResult += num;
					result += (tmpResult!=0 ? tmpResult : 1)
							* UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			}else { // ������ ���
				num = check;
			}
		} // end of while
		return result + tmpResult + num;
	}
}