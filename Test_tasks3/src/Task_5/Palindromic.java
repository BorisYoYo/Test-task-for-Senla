package Task_5;

public class Palindromic {
	
	//Поиск чисел палиндромов(работает только для чисел от 0 до 100)
	public static void findPalindromic() {
		for (byte i = 10; i <= UserInput.n;i +=(byte)+1) {
			
			byte reverse = (byte) ((i - (i%10))/10 + ((i%10)*10)); 
			
			if (i == reverse) {
				System.out.println(i);
			}			
		}
	}
}
