package Task_4;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> words = new ArrayList<String>();
	static String[] input;
	static StringBuilder sb = new StringBuilder();
	
	public static void input() {
		input = scan.nextLine().toLowerCase().split(" ");
	}
	
	//Замена первых букв на загланые и удаление лишних символов
	public static void toUpperCase() {
		for (String word: input) {
			word = word.replaceAll("[^a-zA-Z-а-яёА-ЯЁ+]", "");
			if (!word.isEmpty()) {
				sb.delete(0, sb.length());
				sb.append(word.replace(word.charAt(0),word.toUpperCase().charAt(0)));
				words.add(sb.toString());
			}
		}
	}
}
