package sec1;
//저장 클래스 속성,저장객체//
public class Ex3 {
	private String name;	//학생명		//변수
	final static double PI = 3.14;	//상수(항상 똑같은값유지,대문자로 쓰기)
	private int kor;	//국어점수	
	private int eng;	//영어점수	
	private int mat;	//수학점수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
