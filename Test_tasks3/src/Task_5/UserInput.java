package Task_5;

import java.util.Scanner;

public class UserInput {
	
	static Scanner scan = new Scanner(System.in);
	static int n;
	
	public static void input() {
		System.out.print("Введите диапазон поиска чисел палиндромов от 0 до 100: ");
		n = scan.nextInt();
		if (n < 0 || n > 100) {
			Error.error();
			input();
		}
	}
}
