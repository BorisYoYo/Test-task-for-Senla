package Task_4;

import java.util.ArrayList;
import java.util.Collections;

public class CalcWords {
	
	
	static ArrayList<String> uniqueWords = new ArrayList<String>();
	static ArrayList<Integer> countOfWords = new ArrayList<Integer>();

	//Добавление уникальных слов в список и подсчет повторяюшихся слов
	public static void calc() {
		for (String word: UserInput.words) {
			int count = Collections.frequency(UserInput.words, word);
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
				countOfWords.add(count);
			}
		}
	}
}
