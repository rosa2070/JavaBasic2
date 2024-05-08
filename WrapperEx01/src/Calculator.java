
public class Calculator {
	public static void main(String[] args) {
		String[] words = args[0].split(" ");
		String num1 = words[0];
		String oper = words[1];
		String num2 = words[2];
		
		switch(oper) {
			case "x": 
				System.out.println(Integer.valueOf(num1) * Integer.valueOf(num2));
				break;
			case "+": 
				System.out.println(Integer.valueOf(num1) + Integer.valueOf(num2));
				break;
			case "-": 
				System.out.println(Integer.valueOf(num1) - Integer.valueOf(num2));
				
			
		}
	}
}
