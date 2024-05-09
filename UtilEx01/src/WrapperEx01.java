
public class WrapperEx01 {
	public static void main(String[] args) {
		
		// 10 -> 객체형 변환
		Integer i1 = Integer.valueOf(10);
		// Autoboxing
		Integer i2 = 10;
		
		// unboxing
		int i3 = i1;
		
		int sum = i1 + 20;
		System.out.println(sum);
		
		if (i1 == i3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
