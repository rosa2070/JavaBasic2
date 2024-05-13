package pack4;

import java.util.function.Consumer;

public class MyFunctionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 매개변수가 1개 있고, 리턴이 없는 함수
		Consumer<Integer> consumer = i -> System.out.println("i : " + i);
		consumer.accept(10);

	}

}
