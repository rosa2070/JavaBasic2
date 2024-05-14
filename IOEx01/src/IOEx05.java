import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream("./test2.txt"));
			
			bos.write('a');
			bos.write('b');
			bos.write('\n');
			bos.write('a');
			bos.write('b');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try { bos.close(); } catch(IOException e) {}
		}
		
		System.out.println("출력 완료");

	}

}
