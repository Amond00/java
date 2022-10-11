package sec1;

//실행(메인)클래스 main메소드가 있으면 메인클래스 컨트롤러
//한 줄 각주
/* 클래스명은 자바파일 이름과 같아야한다
 * 여러 줄 각주
 */
public class Ex1 {	//Ex1:클래스명, { }:프로그램 블록의 시작과 끝
		//https://mvnrepository.com/  https://docs.oracle.com/en/java/  자바 라이브러리//
	public static void main(String[] args) { 
		//main(){} : 메인 메서드	
		//main의 괄호() 안에있는 args는 매개변수
		System.out.println("하이~! 자바~!");
		Ex2 ex2 = new Ex2();
		ex2.mathod1();
		Ex3 st1 = new Ex3();
		st1.setName("한태헌");		//set가져오기 get저장
		st1.setKor(100);
		st1.setMat(100);
		st1.setEng(80);
		System.out.println("st1의 학생 이름은 : "+st1.getName()); 		//sysoutCtrl+space
	}
}