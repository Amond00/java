package sec1;
//프로그램(Operation)의 모든 명령은 Op-code(연산자)와 Operand(피연산자)로 이루어짐
//a = a + bc; a기억장소의 데이터와 b"를 더해라 기억장소가 몇개냐에 따라 달라짐
//+ : 연산 명령 -> Op-code
//a, b -> Operand(주소)
//주소(기억장소의 개수) 에 따라 0주소 명령어 형식~ 3주소 명령어 형식
//입력항에 따라 단항 연산과 이항 연산으로 분류됨
//boolean a=true;
//boolean b=1a; 피연산자가 1개니 단항연산
//int c=a*b; 피연산자가 2개니 이항연산
//연산의 종류에 따라 산술, 논리, 비교, 비트(이진수연산), 증감(점점 증가,감소 등), 대입 연산 등이 있음
//
public class Oper1 {
	public static void main(String[] args) {
		int a=20, b=30;
		System.out.println(a); //
		prt();//제0주소 명령 형식 1,2,3 명령형식 까지
		c = a + b;
		//운용방식     : +ab -> pre 전위(fix) order 연산자가 먼저
		//운용방식2 : ab+ -> post 후위(fix) order 연산자가 나중에
		//운용방식3 : a+b -> in 중위(fix) order 연산자가 가운데
	}
	
	public static void prt(){
		System.out.println("data");
	}
}