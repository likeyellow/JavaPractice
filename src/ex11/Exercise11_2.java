package ex11;

import java.util.*;

public class Exercise11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); //중복제거되고 순서유지 안됨 2,6,3,7
		TreeSet tset = new TreeSet(set); // 오름차순으로 정렬 2,3,6,7
		Stack stack = new Stack();//Stack에 넣었다 꺼내면 저장순서 반대가 됨
		stack.addAll(tset);
		
		while(!stack.empty())
			System.out.println(stack.pop());

	}

}
