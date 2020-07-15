package ex5;

import java.util.Arrays;

public class test01 {

	public static void main(String[] args) {
		int [] arr1 = {0, 1, 2, 3, 4};
		
		int [] arr2 = Arrays.copyOfRange(arr1, 0, 7);
		System.out.print(Arrays.toString(arr2));
		
		
		System.out.println();
		
		int [] arr3 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.print(Arrays.toString(arr3));

		System.out.println();
		
		int [] arr4 = Arrays.copyOfRange(arr1,  1, 5);
		System.out.print(Arrays.toString(arr4));
		
		System.out.println();
		
		int [] arr5 = Arrays.copyOfRange(arr1, 0, 5);
		System.out.print(Arrays.toString(arr5));



	}

}
