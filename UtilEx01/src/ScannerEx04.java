import java.util.Scanner;

public class ScannerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요. 입력을 마치려면 q를 입력하세요");
		
		String msg = "";
		// 무한 루프
		while(true) {
			// 입력 프롬프트
			System.out.print("입력 > ");
			msg = sc.nextLine();
			if ( !msg.equalsIgnoreCase("q")) {
				// 입력값 처리
				System.out.println("입력 메시지 : " + msg);
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
