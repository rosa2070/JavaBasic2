import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchZipCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			try {
				BufferedReader br = null;
				br = new BufferedReader(new InputStreamReader(System.in));
				
				BufferedReader br2 = null;
				br2 = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
				

				
				System.out.print("구군이름 > ");
				String msg = br.readLine();
				if (msg.equals("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				System.out.println(msg);
				
				
				String line = null;
				while((line = br2.readLine()) != null) {
					String[] addresses = line.split(",");
					if (addresses[2].startsWith(msg)) {
						// 파일 저장
						BufferedWriter bw = null;
						bw = new BufferedWriter(new FileWriter("./" + msg + ".txt"));
						bw.write('a');
						
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러] " + e.getMessage());
			} 
		}
		

	}

}
