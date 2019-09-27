package Task_4;

public class PrintInfo {
	
	public static void print() {
		for (String word: CalcWords.uniqueWords) {
			System.out.print("Количество слова " + "\""+word+"\"" + " = " 
		   +CalcWords.countOfWords.get(CalcWords.uniqueWords.indexOf(word)) );
			System.out.println();
		}
	}
}
