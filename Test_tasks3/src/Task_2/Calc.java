package Task_2;

public class Calc {
	
	//Расчет наибольшего общего делителя
	public static int nod(int num1,int num2) {
		while (num2 !=0) {
	    int nod = num1 % num2;
	    num1 = num2;
	    num2 = nod;
	    }
	return num1;
	}
	
	//Расчет наименьшего общего кратного
	public static long nok(int num1, int num2) {
		long nok = (num1 * num2) / nod(num1,num2);
		return nok;
	}
}
