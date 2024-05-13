import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 생성
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList(100);
		
		String data1 = "홍길동";
		// String -> Object (자동 형변환)
		a1.add(data1);
		
		Object obj1 = data1;
		a1.add(obj1);
		a1.add("박문수");
		
		System.out.println(a1.size());
		System.out.println(a1.toString());
		
		a1.add("임꺽정");
		System.out.println(a1.toString());
		
		// get
//		Object obj = a1.get(0);
//		String str = (String)obj;
		String str = (String)a1.get(0); // 형변환 필수
		System.out.println(str);
		
		// 전체
		for(int i=0; i<a1.size(); i++) {
			String tstr = (String)a1.get(i);
			System.out.println(tstr);
		}
		
		for(Object tobj : a1) {
			String tstr = (String)tobj;
			System.out.println(tstr);
		}
		
		// 삽입
		a1.add(2, "장길산");
		System.out.println(a1);
		
		a1.set(0, "이몽룡");
		System.out.println(a1);
		
		a1.remove(0);
		System.out.println(a1);
		
		a1.remove(0);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);
		
			
	}

}
