import java.io.File;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일
		// 새로 만들기(File) / 내용변경(다른)
		// 이름 변경 / 삭제
		File file = new File("c:/java/test1.txt");
		File file2 = new File("c:/java/test2.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(file.renameTo(file2)) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		if(file.delete()) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
