
public class Ex9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		Integer intg = (Integer) i;
		Object obj = (Object) i;
		
		Long lng = 100L;
		
		int i2 = intg + 10;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		Integer intg3 = intg2 + i3;
		
		System.out.println(i);
		System.out.println(intg);
		System.out.println(obj);
		System.out.println(lng);
		System.out.println(i2);
		System.out.println(l);
		System.out.println(intg2);
		System.out.println(i3);
		System.out.println(intg3);
 
	}

}
