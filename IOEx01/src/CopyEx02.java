import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\java\\eclipse-jee-2024-03-R-win32-x86_64.zip"));
			bos = new BufferedOutputStream(new FileOutputStream("C:\\java\\eclipse-jee-2024-03-R-win32-x86_64_1.zip"));
			
			int data = 0;
			while(( data = bis.read())!= -1) {
				bos.write(data);
			}
			
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try {bos.close(); } catch(IOException e) {}
			try {bis.close(); } catch(IOException e) {}

		}
	}

}
