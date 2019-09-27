package Task_3;

import java.util.ArrayList;

public class FirstLettToUp {
	
	ArrayList<String> list = new ArrayList<String>();
	
	StringBuilder sb = new StringBuilder();
	
	//Первые буквы к заглавным
	FirstLettToUp(ArrayList<String> list2){
		for (String word:list2) {
			sb.delete(0, sb.length());
			sb.append(word.replace(word.charAt(0),word.toUpperCase().charAt(0)));
			list.add(sb.toString());
		}	
	}
}
