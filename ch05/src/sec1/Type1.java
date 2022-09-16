package sec1;

public class Type1 {
	public static void main(String[] args) {
		//Primitive Type(기본형 타입) : 하나의 저장소(변수)에 하나의 데이터만 저장되는 타입 => 단일 기억장소 stack
		//사용시 반드시 초기화를 해야됨
		//기본 자료는 단일 기억만 하므로 스택과 같은 기억장소에 저장됨.
		//스택(stack)은 LIFO(last in first out) 구조의 기억장소로 가장 마지막에 입력된 데이터가 가장 먼저 출력될 수 있다. 하나의 입출구를 가짐
		//큐(queue)는 FIFO 구조의 기억장소는 순서대로 입력되고 출력되므로 가장 처음에 입력된 것이 가장 먼저 출력된다. 입구 출구 둘 다 있음.
		boolean a=true;
		byte b=120;
		char c='a';
		short d=150;
		int e=150;
		long f;
		float g;
		double h;
		System.out.println(a);
		//System.out.println(e); - 변수e초기화 안하면 사용 못함
		System.out.println(d==e);
		System.out.println(d!=e);
		//primitive type => 변수 타입이 달라도 값을 직접비교핢.
		
	}
}