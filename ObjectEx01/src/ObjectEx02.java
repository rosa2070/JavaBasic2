
public class ObjectEx02 {
	public static void main(String[] args) {
		
		// 비교
		int a1 = 10;
		int a2 = 20;
		// 변수 안에 내용값을 비교
		
		System.out.println(a1 == a2);
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		// 변수 안에 내용값(참조값)을 비교
		System.out.println(o1 == o2);
		// 변수 안에 내용값(멤버 변수 값)을 비교
		System.out.println(o1.equals(o2));
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		
		// String에서 overriding
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person(111, "홍길동", 22);
		Person p2 = new Person(111, "홍길동", 22);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
