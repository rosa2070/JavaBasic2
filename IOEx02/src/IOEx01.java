import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FileInputStream
//		FileInputStream fis = null;
		InputStream fis = null;
		
		try {
			
			// 파일 존재해야 함
			fis = new FileInputStream("./test1.txt");
			
			int data = 0;
			while( ( data = fis.read()) != -1 ) {
				System.out.println((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try { fis.close(); } catch(IOException e) {}
		}
		

	}

}
