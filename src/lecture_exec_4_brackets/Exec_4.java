package lecture_exec_4_brackets;

public class Exec_4 {

	public static void main(String[] args) {

		String expr1 = "4 * (5 - 2) + 6/(2 * (2 + 15))";
		String expr2 = "2 + (2-6)) + 6/(8 - 1)";
		
		System.out.println(bracketCheck(expr1));
		System.out.println(bracketCheck(expr2));;
				
	}
	
	public static boolean bracketCheck(String x){
		
		boolean i = true;
		int counter = 0;
		char[] temp = x.toCharArray();
		
		for (char y: temp){
			if (y == '('){
				++counter;
			}
			else if(y == ')'){
				--counter;
			}
		}
		
		if (counter == 0) {
			i = true;
		}
		
		else if (counter == -1) {
			i = false;
		}
		
		return i;
				
//		if (counter == 0){System.out.println("Brackets are OK.");}
//		if (counter == -1){System.out.println("Brackets are NOT OK.");}
		
	}

}
