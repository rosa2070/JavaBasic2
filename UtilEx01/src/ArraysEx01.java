import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 조작 : Arrays
		String[] arrs = {"aaa", "bbb", "ccc"};
		System.out.println(arrs.toString());
		System.out.println(Arrays.toString(arrs));
		
		// 초기화
		Arrays.fill(arrs, "xxx");
		System.out.println(Arrays.toString(arrs));
		
		Arrays.fill(arrs,  0, 2, "yyy");
		System.out.println(Arrays.toString(arrs));
		
		String[] arrs1 = {"aaa", "bbb", "ccc"};
		String[] arrs2 = {"aaa", "bbb", "ccc"};
		System.out.println(arrs == arrs2);
		System.out.println(Arrays.equals(arrs1, arrs2));
		
		Integer[] arrNums = {5, 3, 3, 2, 1};
		Arrays.sort(arrNums);
		System.out.println(Arrays.toString(arrNums));

	}

}
