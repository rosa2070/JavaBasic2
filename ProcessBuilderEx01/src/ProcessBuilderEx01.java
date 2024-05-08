import java.io.IOException;

public class ProcessBuilderEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// windows 내부 프로그램 실행
		// 프로그램의 위치
		
		// C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe
		
		try {
			ProcessBuilder processBuilder
			//= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
//			= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "www.google.com");
			= new ProcessBuilder("C:\\windows\\system32\\notepad.exe");
			processBuilder.start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
