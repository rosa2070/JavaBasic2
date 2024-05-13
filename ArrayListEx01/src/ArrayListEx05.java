import java.util.ArrayList;

public class ArrayListEx05 {
	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student("1001", "홍길동");
		Student s2 = new Student("1001", "박문수");
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1.toString());
		
		Student stu = a1.get(0);
		System.out.println(stu);
	}

}
