package pack3;

public class MyFunctionalInterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInter1 f = (x) -> System.out.println("x : " + x);
		f.method(10);
		f.method(20);
		
//		MyFunctionalInter2 f2 = (x, y) -> {
//			return x + y;
//		};
		
		MyFunctionalInter2 f2 = (x, y) -> {return x + y;};
		MyFunctionalInter2 f3 = (x, y) -> x + y;
		
		int result = f2.method(10, 20);
		System.out.println(result);
		System.out.println(f3.method(10, 20));
		
		

	}

}
