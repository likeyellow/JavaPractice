package ch9;

public class Exercise9_4 {
	static void printGraph(int[] dataArr, char ch) {
		// (1) printGraph�޼��带 �ۼ��Ͻÿ�
		
		for(int i=0; i<dataArr.length; i++) {
			for(int j=0; j<dataArr[i]; j++) {
				
				System.out.print(ch);
				
			}
			System.out.println(dataArr[i]);
			
		}	
	}

	public static void main(String[] args) {
		printGraph(new int[] {3, 7, 1, 4}, '*');

	}

}
