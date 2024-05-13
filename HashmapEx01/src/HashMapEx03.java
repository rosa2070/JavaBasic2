import java.util.HashMap;

public class HashMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("박문수", 23);
		
		HashMap<String, Person> hm = new HashMap<String, Person>();
		hm.put("a", p1);
		hm.put("b", p2);
		
		System.out.println(hm);
		
		// keySet()
		// values
		for(String key : hm.keySet()) {
			System.out.println(key + " : " + hm.get(key));
		}
		
		for(Person p : hm.values()) {
			System.out.println(p);
		}

	}

}
