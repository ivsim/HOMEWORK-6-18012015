package lecture_exec_3_sentence;

public class Exec_3 {

	public static void main(String[] args) {

		String sentence = "Аз , съм ; + Иво.";
		
		String[] words = sentence.split(",|;|\\.| |\\+");
		
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
		}
		
	}

}
