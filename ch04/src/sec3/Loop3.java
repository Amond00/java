package sec3;

public class Loop3 {
	public static void main(String[] args) {
/*		반복변수=초기값;      1)
		do {
			실행문장;       2)
			증감식;        3)
		}	while(조건식);	 4)
1) -> 2) -> 3) -> 4) 후 만족x까지 2) -> 3) -> 4)		                              
*/ 
		int a=10, tot=0;
		do {
			tot=tot+a;
			a++;
		} while(a<10);
		System.out.println("a="+a+", tot="+tot);
	}
}