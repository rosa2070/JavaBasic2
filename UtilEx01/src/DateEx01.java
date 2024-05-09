import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.util
		// Date
//		Date d = new Date();
//		java.util.Date d = new java.util.Date();
		
		Date d = new Date();
		
		// toString overriding
		System.out.println(d);
		System.out.println(d.toString());
		
		// -- : deprecated
//		System.out.println(d.toLocaleString());
		String strDate = d.toLocaleString();
		System.out.println(strDate);
		
		// 년 월 일 분리 - 문자열 조작
		String[] dates = strDate.split(". ");
		System.out.println(dates[0] + "년 " + dates[1] + "월 " + dates[2] + "일");
		
		// 
		System.out.println(d.getYear() + 1900);
		System.out.println(d.getMonth() + 1);
		System.out.println(d.getDate());
		// 0 : 일요일
		System.out.println(d.getDay());
		// 한글
		// switch / if
		String[] weekname = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(weekname[d.getDay()]);
		
	}

}
