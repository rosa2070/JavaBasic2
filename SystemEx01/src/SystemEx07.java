
public class SystemEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시스템에 대한 환경 정보
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getenv("Path"));
	}

}
