import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "박문수");
		hm.put("b", "홍길동");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		hm.put("c", "임꺽정");
		
		System.out.println(hm);
		
		// 키가 같으면 수정
		hm.put("b", "이몽룡");
		
		System.out.println(hm);
		
		System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		
		hm.remove("a");
		
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);

	}

}
