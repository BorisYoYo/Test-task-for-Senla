package Task_1;

public class MainTask_1 {

	public static void main(String[] args) {
		
	try {
		//Ввод числа
		UserInput.input();
	} catch (NumberFormatException e) {
		Errors.error();
	}
		//Проверка числа на четность или нечетность
		CheckNumber.check();
		//Проверка числа на составное или простое
		CheckNumber.check_2();
	}
}
