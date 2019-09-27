package Task_4;

public class MainTask_4 {

	public static void main(String[] args) {
		
		System.out.print("Введите слово или предложение: ");
		UserInput.input();
		UserInput.toUpperCase();
		
		CalcWords.calc();
		PrintInfo.print();
	}
}
