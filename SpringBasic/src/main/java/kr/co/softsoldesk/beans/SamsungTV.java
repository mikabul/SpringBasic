package kr.co.softsoldesk.beans;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	// #1

	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}

	// #2
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. ");
		System.out.println("가격 : " + price);
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");

	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
