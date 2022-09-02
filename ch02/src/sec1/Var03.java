package sec1;

public class Var03 {

	public static void main(String[] args) {
		//primitive type(기본자료형, 보라색) : 하나의 데이터만 저장 가능한 구조
		boolean a=true;		
		//정수//-2^(n-1)~2^(n-1)-1 바이트 범위 계산 
		byte b=20, c=127;  //-128~127까지만 가능 -> 1byte(8bit) 2^8 가지	
		short d=32767;  //-32768~32767까지만 가능 -> 2byte(16bit)
		int e=65000;  // 4byte(32bit)
		//실수
		long f=650000;  //8byte(64bit)
		float g=3.14f;	//4byte(32bit)  실수 끝에f붙이기
		double h=3.14;  //8byte(64bit)  예외적으로 f안붙여도 됨
		//문자/문자열
		char i='h';		//2byte(16bit)
		
		String j="han"; 		
	}

}
