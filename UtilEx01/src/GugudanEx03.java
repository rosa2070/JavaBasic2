import java.util.Scanner;

public class GugudanEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("단수 입력: ");
			
			String dan = sc.nextLine();
			if (dan.equals("종료")) {
				System.out.println("프로그램 종료");
				break;
			}	
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%s x %s = %s%n", dan, i, Integer.parseInt(dan)*i);
			}
			

		}

		
		sc.close();

	}

}
