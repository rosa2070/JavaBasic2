
public class SystemEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		// 입력값 검사
		if (args.length != 1) {
			System.out.println("비정상 입력");
			// 0 : 정상종료
			System.exit(0);
		} 
		
		System.out.println("정상 입력");
		
		System.out.println("끝");

	}

}
