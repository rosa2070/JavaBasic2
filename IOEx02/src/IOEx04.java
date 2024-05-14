import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = null;
		
		try {
//			bw = new BufferedWriter(new FileWriter("./test1.txt"));
			bw = new BufferedWriter(new FileWriter("./test1.txt", true));
			
			bw.write("안녕 스트링");
			bw.write(System.lineSeparator());
			bw.write("안녕 스트링");
			bw.write(System.lineSeparator());
			
			System.out.println("출력 완료");
		// FileNotFoundException 없음
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try { bw.close(); } catch (IOException e) {}
		}

	}

}
