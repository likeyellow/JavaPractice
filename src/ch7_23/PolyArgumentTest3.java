package ch7_23;
import java.util.*; //VectorŬ������ ����ϱ� ���ؼ� �߰�
public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

	}
}
class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product(){
		price = 0;
		bonusPoint = 0;
	}
}
class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0; // ���� ������ ���ʽ�����
	Vector item = new Vector(); // ������ ��ǰ�� �����ϴµ� ���� Vector ��ü
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	void refund(Product p) { // ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) { // ��ǰ�� Vertor���� �����Ѵ�
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}else { // ���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) { // Vector �� ����ִ��� Ȯ���Ѵ�
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i); // Vector�� i��°�� �ִ� ��ü�� ���´�.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}