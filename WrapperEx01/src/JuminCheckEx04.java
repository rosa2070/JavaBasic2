
public class JuminCheckEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Util 클래스 사용해서 주민등록번호 검사...
		Util util = new Util(args[0]);
		if(util.isCheckJumin()) {
			System.out.println("주민번호 정확");
		} else {
			System.out.println("주민번호 부정확");
		}

	}

}
