package chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void status() {
		System.out.println("TV[power=" + power + ", channel=" + channel + ", volume=" + volume + "]");
	}
	
	public void channel(int channel) {
		this.channel=channel;
	}
	public void volume(int volume) {
		this.volume=volume;
	}
	public void power(boolean power) {
		this.power=power;
	}
}
