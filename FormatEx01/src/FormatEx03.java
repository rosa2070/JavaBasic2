import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		Date date = new Date();
		String strDate1 = format.format(date);
		String strDate2 = format.format(new Date());
		
		System.out.println(strDate1);
		System.out.println(strDate2);

	}

}
