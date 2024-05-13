import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "박문수");
		hm.put("b", "홍길동");
		hm.put("c", "임꺽정");
		
		// key
		// value
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key + " : " + hm.get(key));
		}
		
		Collection<String> values = hm.values();
		for(String value : values) {
			System.out.println(value);
		}
	}

}
