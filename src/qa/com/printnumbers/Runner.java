package qa.com.printnumbers;

public class Runner {

	public static void main(String[] args) {
		
		PrintWordsUnits units = new PrintWordsUnits();
		PrintWordsTeens teens = new PrintWordsTeens();
		PrintWordsHundreds hundreds = new PrintWordsHundreds();
		
		units.printUnits();
		teens.printTeens();
		hundreds.printHundreds();
		
	}

}
