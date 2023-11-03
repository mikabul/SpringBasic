package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	private AppleSpeaker speaker;
	private int price;
	

	public SamsungTV(){
	System.out.println("===> apple 객체 생성");
	}

	 public SamsungTV(AppleSpeaker speaker, int price){
	 System.out.println("===> SamsungTV(3) 객체 생성");
	 this.speaker = speaker;
	 this.price=price;
	  }
	 
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	 
	 public AppleSpeaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	
	@Override
	public void powerOn() {
		 System.out.println("SamsungTV---전원 켠다. ");
		 System.out.println("가격 : " +price );
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
