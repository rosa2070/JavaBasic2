import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("홍길동");
		ll.add("박문수");
		
		System.out.println(ll.size());
		System.err.println(ll);
		
		for(String data : ll) {
			System.out.println(data);
		}

	}

}
