package pack3;

public class Child2 extends Parent {
	public Child2() {
		// TODO Auto-generated constructor stub
		System.out.println("Child2 생성자");
	}
	
	public void viewChild2() {
		System.out.println("Child2 viewChild2");
	}
	
	@Override
	public void doFunc() {
		// TODO Auto-generated method stub
		System.out.println("child2 doFunc");
	}

}
