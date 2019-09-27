package Task_5;

import java.util.InputMismatchException;

public class MainTask_5 {

	public static void main(String[] args) {
		
		try {
			UserInput.input();
		}catch ( InputMismatchException e ) {
			Error.error();
			System.exit(0);
		}
			Palindromic.findPalindromic();
	}
}
