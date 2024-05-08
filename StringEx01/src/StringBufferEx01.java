
public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
		// 내부 버퍼의 크기
		StringBuffer sb2 = new StringBuffer(100);
		StringBuffer sb3 = new StringBuffer("Hello StringBuffer");
		
		// buffer
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		
		// charAt
		// substring
		// indexOf / lastIndexOf
		// replace
		
		// 문자열 조작
		// append / insert / delete
		
		System.out.println(sb3);
		sb3.append("안녕");
		System.out.println(sb3);
		sb3.insert(3, " 추가 ");
		System.out.println(sb3);
		sb3.delete(0, 4);
		System.out.println(sb3);

	}

}
