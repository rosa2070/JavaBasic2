
public class StringEx04 {

	public static String capitalizeName(String strName) {
		String[] names = strName.split(" ");
		String result = "";
		for(String name : names) {
			result += name.substring(0, 1).toUpperCase() + name.substring(1) + " ";
		}
		
		return result.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = args[0].split(" ");
		
		// 입력값 검사
		if(args.length != 1) {
			System.out.println("1개를 입력");
		} else {
//			System.out.println("정상 입력");
			
			String result = StringEx04.capitalizeName(args[0]);
			System.out.println(result);

		}
		
	
	}

}
