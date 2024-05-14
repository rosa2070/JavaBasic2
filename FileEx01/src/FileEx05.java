import java.io.File;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 디렉토리 - 생성 / 이름 변경 / 삭제
		File file = new File("c:/java/dir1");
		File file2 = new File("c:/java/dir2");
		
		if (file2.delete()) {
//		if (file.renameTo(file2)) {
//		if (file.mkdir()) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

}
