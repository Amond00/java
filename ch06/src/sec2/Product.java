package sec2;

public class Product {
	private String pid="a01";
	private String pname="냉장고";
	private int amount=3;
	private int price=80000;
	private String img="icetank01.jpg";
	
	public Product() { }
	public Product(String pid, String pname, int amount, int price, String img){
		this.pid = pid; this.pname = pname; this.amount = amount;
		this.price = price; this.img = img;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int calcMoney(){
		return amount*price;
	}
	public String calcRank(){
		String Rank = "";
		int price = this.price;
		if(price>=100000){
			Rank="고가";
		} else if(price>=50000){
			Rank="중저가";
		} else {
			Rank="저가";
		}
		return Rank;
	}
	public String printImg(){
		return img;
	}
	public void printProduct(){
		System.out.println("아이디: "+pid);
		System.out.println("제품명: "+pname);
		System.out.println("제품수량 : "+amount);
		System.out.println("제품 가격: "+price);
		System.out.println("제품 이미지: "+img);
	}
}
