import java.io.File;
import java.util.Arrays;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 디렉토리 내부 목록(자신 디렉리나 파일)
		// list() => 문자열 목록
		// lastfiles() => 파일 객체목록
		
		File file1 = new File("c:/java");
		String[] lists = file1.list();
		System.out.println(Arrays.toString(lists));
		
		//
		
		File[] listfiles = file1.listFiles();
		for (File listFile : listfiles) {
			System.out.println(listFile.getName());
		}

	}

}
