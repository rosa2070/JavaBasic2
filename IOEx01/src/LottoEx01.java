import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("./lotto(1119).csv"));
			
			String data = null;
			
			int[] lottoNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
							   0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
							   0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
							   0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
							   0, 0, 0, 0, 0, 0};
			
			System.out.println(Arrays.toString(lottoNums));
			
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				String[] nums = data.split(",");
				for(int i=1; i<=6; i++) {
//					System.out.println(Integer.parseInt(nums[i]));
					lottoNums[Integer.parseInt(nums[i])]++;
//					System.out.println(Arrays.toString(lottoNums));
					
				}
				
			}

			
			System.out.println(Arrays.toString(lottoNums));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		

	}

}
