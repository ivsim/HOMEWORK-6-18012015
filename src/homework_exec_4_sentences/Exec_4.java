package homework_exec_4_sentences;

public class Exec_4 {

	public static void main(String[] args) {
		
		String text = "Възторжената и светла душа на Люцкана беше създадена за "
				+ "свърталище на любовта. И наистина, като всеки поет, той беше безумно "
				+ "влюбен, и то в най-хубавото момиче в града - Цветана. Тя беше дъщеря на "
				+ "един от най-първите чифликчии в околността. По една отколешна традиция, която "
				+ "заможните семейства още пазеха, Цветана се учеше в Роберт колеж в Цариград, но всяка "
				+ "ваканция прекарваше тука. Тя беше хубаво момиче, мургава, с черни и замислени очи на сърна, "
				+ "с една доста едра луничка на едната си буза. В града може би имаше по-хубави момичета от нея. "
				+ "Но туй, което липсваше на тях, а всички виждаха у Цветана, беше тая непринудена грация, това "
				+ "тънко благородство и достойнство, което идеше от цялото й същество. Тя не дружеше почти с никого, "
				+ "намираха я надменна и горда, говореха зле за нея. Но приятел или враг, млад или възрастен, човек не "
				+ "можеше да не се загледа в това момиче, което само като че не виждаше никого, пристъпваше бавно, "
				+ "съсредоточено в себе си, чуждо на всичко околно - гордата и недостъпна самотност на царкиня, доведена "
				+ "от далечна земя.";
		
		String word = "Цветана";
		
		String[] sentences = text.split("\\.");
		
		for (String string : sentences) {
			if (string.contains(word)) {
				System.out.printf("%s.%n", string.trim());
			}
		}
		
		//another way of doing it...
		
		System.out.println();//empty line...
		
		int initPosition = 0;
		
		for (int dotPosition = text.indexOf('.'); dotPosition != -1; dotPosition = text.indexOf('.', dotPosition+1)) {
			String temp = text.substring(initPosition, dotPosition+1);//substring substrings to end of string + 1 !!!
			initPosition = dotPosition + 1;
			if (temp.contains(word)) {
				System.out.println(temp.trim());
			}
		}
		
				
	}

}
