package Task_2;

import java.util.Scanner;

public class UserInput {
	
	static Scanner scan = new Scanner(System.in);
	
	static String input;

	//Ввод числа
	
	public static int input() {
		
		input = scan.nextLine().trim();
		
		if (!input.equals("[0-9]+") && !input.equals("0")) {
			int in = Integer.parseInt(input);
			return in;	
		} else {
			Errors.error();
			return 0;
		}
	}
}
