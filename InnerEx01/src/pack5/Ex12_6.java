package pack5;

public class Ex12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Direction2 d : Direction2.values()) 
			System.out.printf("%s=%d%n", d.name(), d.getValue());
			
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
		

	}

}
