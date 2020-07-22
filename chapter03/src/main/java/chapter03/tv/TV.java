package chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public void status() {
		System.out.println("[TV] power: "+power+", volume: "+volume+", channel: "+channel);
	}
}
