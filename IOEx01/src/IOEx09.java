import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("./test2.txt"));
			
			bw.write("Hello String");
			bw.write("\n");
			bw.write("Hello String");
			bw.write(System.lineSeparator());
			bw.write("Hello String");
			bw.newLine();
			bw.write("Hello String");
			
			System.out.println("출력 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try { bw.close(); } catch (IOException e) {}
		}
		

	}

}
