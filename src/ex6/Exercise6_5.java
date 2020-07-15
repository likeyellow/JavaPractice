package ex6;
/* [6-5]
 * Student클래스에 생성자와 info()를 추가하시오
 * 
 * [실행결과]
 * 홍길동, 1, 1, 100, 60, 76, 236, 78.7
 */
public class Exercise6_5 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}
}
class Student2{
	//(1) 알맞은 코드를 넣어 완성하시오
	String name;
	int ban, num;
	int eng, kor, math;
	
	Student2(String name, int ban, int num, int eng, int kor, int math){
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}
		
		int getTotal() {
			return eng+kor+math;
		}
		
		float getAverage() {
			return (int)(getTotal()/3f*10+0.5f)/10f;
		}
	
		
	String info() {
		return name+", "+ban+", "+num+", "+eng+", "+kor+", "+math
			+ ", "+getTotal()+", "+getAverage();
	}
	
}
