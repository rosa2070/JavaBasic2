import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 절대 경로
		File f1 = new File("c:/java/eclipse/eclipse.exe");
		// 상대 경로
		File f2 = new File("../../eclipse.exe");
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
		
		System.out.println(f1.getPath());
		System.out.println(f2.getPath());
		
		try {
			System.out.println(f1.getCanonicalPath());
			System.out.println(f2.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
