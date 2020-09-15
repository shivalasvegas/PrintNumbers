package qa.com.printnumbers;


public class PrintWordsTens {

	public static String numberWordsTens[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public void printTeens() {
	
		for (int i=0; i<9; i++) {
			System.out.println(numberWordsTens[i]);
		}	
	}

}
