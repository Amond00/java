package sec2;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student("김기태", 90, 80, 90);
		System.out.println("이름 : "+st1.name);
		System.out.println("총점 : "+st1.calcTot());
		System.out.println("평균 : "+st1.calcAvg());
		System.out.println("학점 : "+st1.calcHak());
		System.out.println("합불여부 : "+st1.calcRes());
	}
	
}