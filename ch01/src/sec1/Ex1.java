package sec1;

//실행(메인)클래스 main메소드가 있으면 메인클래스 컨트롤러//
public class Ex1 {
		//https://mvnrepository.com/  https://docs.oracle.com/en/java/  자바 라이브러리//
	public static void main(String[] args) {		
		System.out.println("하이~! 자바~!");
		Ex2 ex2 = new Ex2();
		ex2.mathod1();
		Ex3 st1 = new Ex3();
		st1.setName("한태헌");		//set가져오기 get저장
		st1.setKor(100);
		st1.setMat(100);
		st1.setEng(80);
		System.out.println("st1의 학생 이름은"+st1.getName()); 		//sysoutCtrl+space
	}
}