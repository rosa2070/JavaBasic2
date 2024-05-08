import java.util.Objects;

public class Person {
	// 캡슐화
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	// 내부 데이터 접근
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Person p = (Person) obj;
		// 내용값을 비교
		if (p.id == this.id && p.name.equals(this.name) && p.age==this.age) {
			result = true;
		}
		return result;
	}
	
	
	
	
	
	
	
	

}
