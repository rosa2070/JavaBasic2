import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("./" + args[0] + ".txt");
			
			int dan = Integer.parseInt(args[0].replaceAll("단", ""));
			
			// 문자열 -> 문자(char)
			// 48은 ASCII 코드에서 숫자 0의 값
			for(int i=1; i<=9; i++) {
				fos.write(dan + 48);
				fos.write(' ');
				fos.write('X');
				fos.write(' ');
				fos.write(i + 48);
				fos.write(' ');
				fos.write('=');
				fos.write(' ');
				
				int sum = dan * i;
				
				// sum이 두 자리 수인 경우
				// 첫번째 자리수 구한 후
				// 두번째 자리수 구하기
				if (sum >= 10) {
					fos.write(sum / 10 + 48);
					fos.write(sum % 10 + 48);
				} else {
					fos.write(sum + 48);
				}
				fos.write('\n');

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { fos.close(); } catch(IOException e) {}
		}

	}
}
