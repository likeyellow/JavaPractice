package ex4;

public class Exercise4_4_2 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 0;
		int i = 0;
		
		while(sum<=100) {
			
			
			
			 i++;
			 
			 
			// if(num%2!=0) {
			//	 num = s * i;
			 //	 sum+=num;
			 	// System.out.printf("%d %d", num , sum);
		//	 }else if(num%2==0) {
			//	 num = -s * i;
			//	 sum+=num;
			// }
			 
			 num = s * i;
			 s=-s;
			 sum += num;
			 
			 if(sum >=100)
				 break;
			
			 
			 
		}
		
		System.out.println("총합은 : "+sum+ "이고  합한 숫자는 " + num + "입니다.");

	}

}
