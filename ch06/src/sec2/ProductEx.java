package sec2;

public class ProductEx {
	public static void main(String[] args) {
	Product pr1 = new Product();
	System.out.println("결제 금액: "+pr1.calcMoney());
	System.out.println("금액대: "+pr1.calcRank());
	System.out.println("제품 이미지: "+pr1.printImg());
	System.out.println("*****상세 정보*****");
	pr1.printProduct();
	}
}