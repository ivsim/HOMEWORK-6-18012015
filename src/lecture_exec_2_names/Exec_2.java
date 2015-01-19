package lecture_exec_2_names;

public class Exec_2 {

	public static void main(String[] args) {

		String[] names = {"Иван", "Илиян", "Моника", "Цвети", "Коце"};
		
		String sentence = "Цвети и Моника ходят на курса по Java, на който ходят Иван, Илиян и Коце.";
		
		int tempCounter = 1;
		
		for (String x: names){
						
			if (sentence.startsWith(x)){
				System.out.println("Sentence starts with some name.");
			}			
						
			else if (sentence.endsWith(x + '.')){
				System.out.println("Sentence ends with some name.");
			}
			
			else if (sentence.contains(x) && tempCounter == 1){//this is how to make a repetitive action be played only once in a loop...
				System.out.println("Sentence contains some name.");
				++tempCounter;
			}
		}
		
//		for (String x: names){
//		if (sentence.contains(x)){
//			System.out.println("Sentence contains some name.");break;
//		}
//		
//		}
		
		
		
		
	}

}
