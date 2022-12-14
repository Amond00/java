package sec1;

public class Oper5 {
	public static void main(String[] args) {
		//비트(2진) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e =c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d => "+e);	//2진수 and =>8
		System.out.println("c | d => "+f);	//2진수 or =>62
		System.out.println("~(c & d) => "+g);	//2진수~ 보수(-를 담당)=>-9
		System.out.println("c ^ d => "+h);	//배타적OR(eXclusive OR) 입력이 서로 다를때 참 =>54
		System.out.println("d >> 2 => "+(d >> 2));	//오른쪽 시프트 => 10 시프트 좌측으로 밀어서 계산
		System.out.println("d << 2 => "+(d << 2));	//왼쪽 시프트 => 160
		System.out.println("d >>> 2 => "+(d >>> 2));   //오른쪽 이중 시프트 => 10 
		//System.out.println("d <<< 2 는 존재하지 않음") 왼쪽 이중 시프트는 연산자가 없음
		//연산시 부정과 불능 그리고 예외 처리
		//System.out.println(a / 0);Not a Number => NaN(부정) 0으로는 못나눔
		//System.out.println("k" / 4);
		//System.out.println('k' / 4);  	//문자 열은 나눌 수 없지만 문자는 나눌 수 있다.(아스키코드로) "" '' 차이
		//System.out.println(a % 0);		//Infinity(불능) 나누기를 제외한경우 인피니티
		try {	//예외처리
			int k = 20;
			System.out.println(k / 0); 	//실행해야할 구만
		} catch(ArithmeticException e1){	
			System.out.println("산술연산에 오류가 존재함");	//실행해야할 구문이 오류 발생시 처리해야할 내용 산술연산 artex
			//e1.printStackTrace();
		}
	}
}
