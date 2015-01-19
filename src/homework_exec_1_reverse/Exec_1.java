package homework_exec_1_reverse;

import java.util.Scanner;

public class Exec_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter word: ");
		String word = input.nextLine();
		
		input.close();
		
		char[] wordToChars = word.toCharArray();
		
		for (int i = wordToChars.length - 1; i >= 0 ; i--) {
			System.out.printf("%s", wordToChars[i]);
		}
		
	}

}
