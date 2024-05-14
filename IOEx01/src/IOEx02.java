import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./test.txt");
			
			int data = 0;
			// 파일 끝까지
			// 다국어 읽지 못함
			// 엔터키나 탭키도 문자임
			while((data = fis.read()) != -1) {
//				System.out.print((char)data);
				// \n
				
				// window - \r\n
				// 다른 os - \n
				
				if (data == '\r') {
					System.out.print("(n)");
				} else {
					System.out.print((char)data);
				}
			}
			
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try {fis.close(); } catch(IOException e) {}
		}

	}

}
