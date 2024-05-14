import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 디렉토리
		File f11 = new File("c:\\java\\eclipse");
		File f12 = new File("c:/java\\eclipse");
		File f13 = new File("c:/java\\eclipse1");
		
		// exist()
		System.out.println(f11.exists());
		System.out.println(f13.exists());
		
		File f21 = new File("c:/java/eclipse/eclipse.exe");
		File f22 = new File("c:/java/eclipse/eclipse.bat");
		
		System.out.println(f21.exists());
		System.out.println(f22.exists());
		
		// isDirectory() / isfile()
		
		System.out.println(f21.isFile());
		System.out.println(f21.isDirectory());
		
		// canExecute / canRead / canWrite - permission
		System.out.println(f21.canWrite());
		
		// isHidden
		File f23 = new File("c:/java/test.txt");
		System.out.println(f23.isHidden());
		
		
		
		

	}

}
