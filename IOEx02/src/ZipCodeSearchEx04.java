import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipCodeSearchEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("동이름을 입력하세요. 입력을 마치려면 q를 입력하세요 : ");
			
			String msg = scan.nextLine();
			
			if(msg.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			} else if (msg.length() < 2) {
				System.out.println("2자 이상 입력");
			// 한글 검사
			} else if (msg.charAt(0) < 0xAC00 || msg.charAt(0) >0xD7A3) {
				System.out.println("첫글자 한글이어야 합니다.");
			} else {
//				System.out.println("정상 수행");
				
				try {
					// 파일 읽기
					BufferedReader br = null;
					br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
					
					String line = null;
					while((line = br.readLine()) != null) {
						String[] addresses = line.split(",");
						if (addresses[3].startsWith(msg)) {
							System.out.printf("[%s] %s %s %s %s %s%n", 
									addresses[0], addresses[1], addresses[2], addresses[3], addresses[4], addresses[5]);
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		scan.close();
		
		
	
	}

}
