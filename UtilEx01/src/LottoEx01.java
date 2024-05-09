import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[45];
		Random random = new Random();
		for(int i=0; i<30; i++) {
			for (int j=0; j<i; j++) {
				if (numArr[i] != numArr[j]) {
					numArr[i] = random.nextInt(45) + 1;
				}
			}

		}
		
		System.out.println(Arrays.toString(numArr));
		
		

	}

}
