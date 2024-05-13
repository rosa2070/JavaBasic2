package pack1;

// 실행클래스
public class MyFunctionalInerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 내부 익명 클래스
		MyFunctionalInter f = new MyFunctionalInter() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("method() 호출");
			}
		};
		
		f.method();
		
		// Lambda
		f = () -> {
			System.out.println("method() 호출 2");
		};
		
		f.method();
		
		f = () -> System.out.println("method() 호출 3");
		
		f.method();


	}

}
