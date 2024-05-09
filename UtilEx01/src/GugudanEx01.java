import java.util.Scanner;

public class GugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력: ");
		String dan = sc.nextLine();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%s X %s = %s%n", dan, i, (Integer.parseInt(dan)*i));
		}

	}

}
