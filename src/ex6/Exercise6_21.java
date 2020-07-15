package ex6;
/* [6-21]
 * TvŬ������ �־��� ������� �ϼ��Ͻÿ�. �ϼ��� �Ŀ� �����ؼ� �־��� �������� ��ġ�ϴ��� Ȯ���϶�.
 * [����] �ڵ带 �ܼ��� �ϱ� ���ؼ� ��ȿ���˻�� �������� �����ߴ�.
 * 
 */
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		/*
		if(isPowerOn == true)
			isPowerOn = false;
		else
			isPowerOn = true;
		*/
		isPowerOn = !isPowerOn;
	}
	void volumeUP() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
		if(volume < MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
		if(volume > MIN_VOLUME)
			volume--;
		
	}
	void channelUp() {
		// (4) channel�� ���� 1���� ��Ų��.
		// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
		if(channel == MAX_CHANNEL)
			channel = MIN_CHANNEL;
		channel++;
	}
	void channelDown() {
		// (5) channel�� ���� 1���ҽ�Ų��.
		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
		if(channel == MIN_CHANNEL)
			channel = MAX_CHANNEL;
		channel--;
	}
} // class MyTv

public class Exercise6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUP();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);

	}
}
