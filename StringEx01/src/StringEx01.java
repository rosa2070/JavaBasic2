
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 저장
		// String / StringBuffer / StringBuilder]
		
		// 생성
		String str1 = "Hello String";
		String str2 = new String("Hello String");
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(charArray);
		
		System.out.println(str1);
		
		// 문자열의 비교
		String str21 = "Hello String";
		String str22 = "Hello String";
		System.out.println(str1.equals(str2));
		System.out.println(str1 ==str2);

	}

}
