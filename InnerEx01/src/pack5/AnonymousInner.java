package pack5;

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InnerA a = new InnerA();
		
		// 익명 이너클래스
		InnerA a = new InnerA() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
			}
		};
		
		a.viewInner();
		
		new InnerA() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
				
			}
		}.viewInner();

	}

}
