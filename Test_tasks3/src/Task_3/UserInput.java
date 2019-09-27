package Task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
	
	Scanner scan = new Scanner(System.in);
	
	String [] array;
	
	ArrayList<String> list = new ArrayList<String>();
	
	//Ввод и отсеивание цифр и знаков
	public String [] input() {
		System.out.print("Введите слово или предложение: ");
		String words = scan.nextLine().toLowerCase();
		words = words.replaceAll("[^a-zA-Z-а-яёА-ЯЁ+]", " ");
		array = words.split(" ");
		return array;
	}
	//Удаление пробелов и добвление в список
	public void delTrash(String[]arr) {
		for (String word:array) {
			if (!word.isEmpty()) {
				list.add(word);
			}
		}
	}
}
