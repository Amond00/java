package sec4;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		boolean run = true;
		int money = 0, balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("----------------------");
			System.out.println("1.예금 |2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			int job = scanner.nextInt();
			switch(job){
			case 1:
				System.out.print("입금액: ");
				money = scanner.nextInt();
				balance=balance+money;
				break;
			case 2:
				System.out.print("출금액: ");
				money = scanner.nextInt();
				balance=balance-money;
				break;
			case 3:
				System.out.println("잔액 "+balance);
				break;
			default:
				System.out.print("종료합니다.");
				run=false;
			}
			
			
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}