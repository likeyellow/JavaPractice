package ch14;

public class ex1 {

	public static void main(String[] args) {
		int[] arr = {20, 10, 35, 30, 7};
		int max = arr[0], min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				
			}else if(arr[i] < min){
				min = arr[i];
				
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
