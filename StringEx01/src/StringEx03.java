
public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = args[0].split(" ");
		
		// 입력값 검사
		if(args.length != 1) {
			System.out.println("1개를 입력");
		} else {
//			System.out.println("정상 입력");
			String[] names = args[0].split(" ");
			String result = "";
			for(String name : names) {
				result += name.substring(0, 1).toUpperCase() + name.substring(1) + " ";
			}
			
			System.out.println(result.trim());
		}
		
	
	}

}
