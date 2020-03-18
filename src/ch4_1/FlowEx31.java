package ch4_1;

public class FlowEx31 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;	// break와 달리 반복문을 벗어나지 않고 조건식이 참이면 블럭의 끝으로 이동
			System.out.println(i);
		}

	}

}
