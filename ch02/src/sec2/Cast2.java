package sec2;

public class Cast2 {

	public static void main(String[] args) {
		int a=100, b=23, c;
		float d, e, f;
		c = a / b;		//4 -> 자동 형 변환
		System.out.println("c="+c);
		d = (float) a / b;		//4.0 -> 강제 형 변환을 해야하는 경우
		System.out.println("d="+d);
		e = 500 / 3.0f; //3 -> 3.0 실수뒤엔 f 형 변환 연산
		System.out.println("e="+e);
		System.out.println("byte :"Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short : "+Short.MIN_VALUE+"~"+SH);
		
	}
}
