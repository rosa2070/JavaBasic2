package pack3;

public class Outer3 {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			System.out.println("             value :" + value);
			System.out.println("        this.value :" + this.value);
			System.out.println(" Outer3.this.value :" + Outer3.this.value);
		}
	}

}
