package sec3;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		int jum[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int n=0;n<jum.length;n++){
			System.out.print((n+1)+"번째 사람 점수 : ");
			jum[n] = sc.nextInt();
		}
/*
  		반복변수=초기값  ①
		while(조건식){ ②
			반복실행문;  ③
			증감식;  ④
		}
		① -> ② -> ③ -> ④  실행되다가 조건이 만족하는 동안 ② -> ③ -> ④ 순으로 반복 수행됨
*/
		int n=0;
		int tot=0;
		while(n<jum.length){
			System.out.println("점수"+n+" : "+jum[n]);
			tot=tot+jum[n];
			n++;
		}
		System.out.println("전체 총점 : "+tot);
		sc.close();
	}
}