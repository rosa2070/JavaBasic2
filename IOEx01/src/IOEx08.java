import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./test.txt"));
			
//			int data = 0;
//			while((data = br.read()) != -1) {
//				System.out.print((char)data);
//			}
			
			String data = null;
			// 엔터키까지 읽음
			while ( (data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try { br.close(); } catch (IOException e) {}
		}

	}

}
