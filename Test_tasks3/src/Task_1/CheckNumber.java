package Task_1;

public class CheckNumber {
	
	//Проверка числа на четность или нечетность
	public static void check() {
		if (UserInput.numb % 2 == 0) {
			System.out.print("Это число чётное");
		} else {
			System.out.print("Это число нечётное");
		}
	}
	
	//Проверка числа на составное или простое
	public static void check_2() {
		int count = 0; 
		for (int i = 1; i < 20; i++) {
			if (UserInput.numb % i == 0) {
				count++;
			}
		}
		
		if (count > 2) {
			System.out.println(" и составное");
		} else {
			System.out.println(" и простое");
		}
	}
}
