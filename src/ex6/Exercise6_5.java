package ex6;
/* [6-5]
 * StudentŬ������ �����ڿ� info()�� �߰��Ͻÿ�
 * 
 * [������]
 * ȫ�浿, 1, 1, 100, 60, 76, 236, 78.7
 */
public class Exercise6_5 {
	public static void main(String[] args) {
		Student2 s = new Student2("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}
}
class Student2{
	//(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
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
