import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본 자료형 - 8
		// Autoboxing
		ArrayList a1 = new ArrayList();
		
		// object - wrapper - autoboxing - 1 
		a1.add(1);
		a1.add(2);
		
//		Integer i1 = Integer.valueOf(3);
		Integer i1 = 3;
		Object obj = i1;
		a1.add(obj);
		
		System.out.println(a1.toString());
		
		Integer i2 = (Integer)a1.get(0);
		System.out.println(i2.intValue());
		
		// unboxing
		int i3 = (int)a1.get(1);
		System.out.println(i3);
		


		
		

	}

}
