import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in = 표준 입력(키보드 입력)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		// 단어 입력
		String msg  = sc.nextLine();
		System.out.println("입력 : " + msg);
		
		sc.close();

	}

}
