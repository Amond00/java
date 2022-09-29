package sec1;
//ArrayIndexOutOfBoundsException : 배열의 범위(요소수)보다 더 많은 데이터를 요구할 경우 발생

public class Exception2 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int i=0;
		while(i<=3){
			try {
				arr[i] = i*10-5;
				i++;
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배정된 배열의 요소수보다 더 많은 데이터를 요구하였음");
				e.getMessage();
				break;
			} catch(Exception e){
				System.out.println("원인불명의 예외 발생");
				e.printStackTrace();
			} finally {
				System.out.println("종료");
			}
		}
	}
}