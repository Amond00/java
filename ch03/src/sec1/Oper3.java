package sec1;

public class Oper3 {

	public static void main(String[] args) {
		//문자열 결합
		byte a='k', b='i', c='m'; //k에속한 키번호가나옴
		int d = 1004;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println(a+b+c+1004); // k i m 에 맞는 아스키 코드가 인식 107 105 109 (a b c는 문자)
		System.out.println("kim"+d); //문자열 + 숫자 =문자열  문자는 ' 문자열은 "
		//증감 연산자
		int k=1, l=1, m=1, n=1;
		System.out.println();
		System.out.println(k++); 
		System.out.println(k);	//k를 1로 출력하고 증가시켜서 다음에 k출력하면 2로 뜸 -> 후위연산
		System.out.println(++l);
		System.out.println(l);	//l에 1을 더하고 출력 시킴 즉 둘다 2 -> 전위연산
		System.out.println(m--); 
		System.out.println(m);	//후위연산
		System.out.println(--n); 
		System.out.println(n);	//전위연산
		//대입 연산자
		int p=20, r=30;
		p=p+1;	//p++ ++p 랑 사실상 같음
		p+=2;	//p=p+2 를 이렇게 줄여 쓸 수 있다
		r-=2;	//r=r-2
		System.out.println(p);
		System.out.println(r);
		p*=2;	//p=p*2
		r/=2;	//r=r/2
		System.out.println(p);
		System.out.println(r);
	}
}