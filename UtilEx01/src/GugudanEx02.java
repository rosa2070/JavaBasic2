import java.util.Scanner;

public class GugudanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 단수 입력: ");
		String startDan = sc.nextLine();
		System.out.print("끝 단수 입력: ");
		String endDan = sc.nextLine();
		
		for(int dan=Integer.parseInt(startDan); dan<=Integer.parseInt(endDan); dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%s x %s = %s\t", dan, i, dan*i);
			}
			System.out.println();
		}

	}

}
