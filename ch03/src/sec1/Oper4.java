package sec1;

public class Oper4 {
	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자 (==,!=,>,>=,<,<=) 초과=후 이상=이후 미만=전 이하=이전 ture or false 출력 
		System.out.println("a==b => "+(a==b)); //f	
		System.out.println("a!=b => "+(a!=b));	//t
		System.out.println("a>b => "+(a>b));	//t
		System.out.println("a>=b => "+(a>=b));	//t
		System.out.println("a<b => "+(a<b));	//f
		System.out.println("a<=b => "+(a<=b));	//f
		System.out.println("a가 문자열이 맞나? => "+a instanceof String); //t
		//논리연산  => and&&:둘 다 맞을때만 참 ||or:둘 중 하나만 맞아도 참
		
		//논리연산자(단항연산) => !참거짓을반대로
		System.out.println("a>b && c>d => "+(a>b && c<d));	//f
		System.out.println("a<b || c<d => "+(a>b || c<d));	//t
		System.out.println("!(a>b => "+(!(a>b)));	//f
		//삼항 연산자 => 조건? 참일때식: 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다"); //t(크거나같다)
	}
}
