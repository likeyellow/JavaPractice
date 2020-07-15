package ex7;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// (1) 알맞은 코드를 넣어 완성하시오.
	private boolean isPowerOn(){
		return isPowerOn=! isPowerOn;
	}
	/*
	private void channel(int channel){
		this.channel = channel;
		
	}
	private void volume(int volume){
		this.volume = volume;
	}
	*/
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		
		prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다.
		this.channel = channel;
		
	}
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	public void gotoPrevChannel() {
		
		setChannel(prevChannel); // 현재 채널을 이전 채널로 변경한다.
	}
	
}
public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("VOL:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());

	}

}
