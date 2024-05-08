
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성
		Object o1 = new Object();
		// 클래스이름@참조주소
		System.out.println(o1);
		System.out.println(o1.toString());
		
		String str = o1.toString();
		System.out.println(str);
		
		// o1.getclass() = 클래스의 정보
 		System.out.println(o1.getClass().getName());
 		System.out.println(o1.hashCode());
 		System.out.printf("%x%n", o1.hashCode());
 		
 		Person p = new Person(111, "홍길동", 22);
 		System.out.println(p);
 		System.out.println(p.toString());
 		
 		// 내부 데이터 ..
 		System.out.println(p.getId());
 		System.out.println(p.getName());
 		System.out.println(p.getAge());

 		
 		// toString
 		// 일반적 : 참조값 / 내부 데이터가 있는 경우 : 데이터 확인
 		// String 클래스 내부에서 toString 메서드를 overriding
 		String str1 = new String("Hello");
 		System.out.println(str1);
 		System.out.println(str1.toString());
	}

}
