package pack4;

public class LocalInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// readonly
		final int x = 100;
		
		class Inner {
			private int y1 = 200;
			public int y2 = 200;
			
			public Inner() {
				System.out.println("Inner : " + this);
			}
			
			public void viewInner() {
				System.out.println(x);
				
				System.out.println(y1);
				System.out.println(y2);
				
//				x++;
				System.out.println(x);
			}
		}
		
		Inner inner = new Inner();
		inner.viewInner();
	}

}
