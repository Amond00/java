package sec3;

public class Loop8 {
	public static void main(String[] args) {
		//이중for문을 활용하여 아래와 같은 형태의 구구단을 출력
 /*		2*1=2 3*1=3 ,......9*1=9
 *      2*2=4 3*2=6 ,...........
 *      ........................
 *      2*9=18 ,..........9*9=81
 */
		for(int i=2; i < 10; i++) {
			System.out.println(i+"단");
            
			for(int j=1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j+"\t");
			}
			System.out.println();
		}	
	}
}