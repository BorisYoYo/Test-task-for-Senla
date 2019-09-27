package Task_2;

public class MainTask_2 {
	
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		
	try {	
		System.out.print("Введите первое число: ");
		num1 = UserInput.input();
		System.out.print("Введите второе число: ");
		num2 = UserInput.input();
	}catch(NumberFormatException e) {
		Errors.error();
	}
			
		System.out.println(Calc.nod(num1, num2));
		System.out.println(Calc.nok(num1, num2));
	}
}
