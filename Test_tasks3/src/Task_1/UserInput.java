package Task_1;

import java.util.Scanner;

public class UserInput {
	
	public static String number;
	public static int numb;
	
	public static Scanner scan = new Scanner(System.in);
	
	//Ввод числа
	public static int input() {
		System.out.print("Введите число: ");
		number = scan.nextLine().trim();
		
		//Проверка ввода на числа
		if (!number.equals("[0-9]+")) {
			numb = Integer.parseInt(number);
			
			//Проверка на отрицательный ввод или ноль
			if (numb > 0) {
				return numb;
			} else {
				Errors.error();
				return 0;
			}
		} else {
			Errors.error();
			return 0;
		}
	}
}
