package pack2;


public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		System.out.println(p1 instanceof Child1);
		System.out.println(p2 instanceof Child2);
		
		// false
		System.out.println(p1 instanceof Child2);
		
		System.out.println(p1 instanceof Parent);
		System.out.println(p2 instanceof Parent);
		
		System.out.println(p1 instanceof Object);
		

	}

}
