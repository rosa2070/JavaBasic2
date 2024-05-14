import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataOutputStream dos = null;
		
		try {
			// 2차 스트림
			dos = new DataOutputStream(new FileOutputStream("./data.dat"));
			
			dos.writeInt(2024);
			dos.writeUTF("UTF-8 형식으로 저장");
			dos.writeFloat(1.8f);
			
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			try {
				dos.close();
			} catch (IOException e) {}
		}

	}

}
