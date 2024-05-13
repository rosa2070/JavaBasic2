package pack1;

public class InstanceInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
//		System.out.println(outer.x1);
		System.out.println(outer.x2);
		
		// 이너클래스 생성
		Outer.Inner inner = outer.new Inner();
//		System.out.println(inner.y1);
		System.out.println(inner.y2);
		
		inner.viewInner();
		
		

	}

}
