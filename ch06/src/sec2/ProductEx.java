package sec2;

public class ProductEx {
	public static void main(String[] args) {
	Product pr1 = new Product();
	System.out.println(pr1.calcMoney());
	System.out.println(pr1.calcRank());
	System.out.println(pr1.img);
	System.out.println("*****상세 정보*****");
	pr1.printProduct();
	}
}