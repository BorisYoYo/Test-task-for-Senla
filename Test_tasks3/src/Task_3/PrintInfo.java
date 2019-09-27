package Task_3;

import java.util.ArrayList;
import java.util.Collections;

public class PrintInfo {
	
	public static void print(ArrayList<String> list) {
		
		Collections.sort(list);
		System.out.println("Количество слов в предложении: " + list.size());
		System.out.println(list);
	}
}
