
public class MathEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 난수 = 랜덤
		
		// 0 <= x < 1 double
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		// 0 <= x < 10 정수
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.floor(Math.random()*10));
		
		// 1 <= x < 46
		System.out.println((int)(Math.random()*45 + 1));

	}

}
