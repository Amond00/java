package sec2;

public class CellPhone {
	final static String COMPANY="삼성";
	String model;
	String color;
	
	final static public void powerOn(){
		System.out.println("폰의 전원을 켭니다."); }
	final static public void poweroff(){
	System.out.println("폰의 전원을 끕니다. "); }
	public void bell() { System.out.println("벨이 울립니다."); }
	public void hangIn() { System.out.println("전화를 받습니다."); }
	public void sendVoice(String msg) {
		System.out.println("본인: "+msg);
	}
	public void recieveVoice(String msg){
		System.out.println("상대방: "+msg);
	}
	public void hangOut() { System.out.println("전화를 끊습니다." );}
}