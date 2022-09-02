package sec2;

public class Cast1 {
	public static void main(String[] args) {
		int a=1004, b;
		short c, d;
		long e, f;
		byte g, h;
		b = 65538;
		//c = a;
		c = 500;
		a = c;	//c보다 a가 크기 때문에 가능 반대면 불가능. short -> int = 자동 형 변환(auto casting)
		d = (short) b;	//강제형변환force casting:형변환 연산자에 의한 형변환
		System.out.println("d="+d);
		System.out.println("b="+b);
		/* e는 100*/
		e = b;
		/* e는 65538*/
		f = a + c;
		a = (int) (f + c);  //강제 형변환
	}
}