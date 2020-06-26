package qa.com.printnumbers;

public class PrintWordsHundreds {

	public static String numberWordsUnits[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	public static String numberWordsTeens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String numberWordsTens[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public void printHundreds() {

		for (int i=0; i<10; i++) {
		 // i = prefix to hundreds
			
			for (int j=0; j<10; j++) {
				// j = units	
				System.out.println(numberWordsUnits[i] + " hundred " + numberWordsUnits[j] );
					
			}	
			
			for (int j=0; j<9; j++) {
				// j = teens	
				System.out.println(numberWordsUnits[i] + " hundred " + numberWordsTeens[j] );
					
			}	
			
			for (int j=0; j<8; j++) {
				// j = tens 
				for (int k=0; k<10; k++) {
					// k = units
					System.out.println(numberWordsUnits[i] + " hundred " + numberWordsTens[j] + " " + numberWordsUnits[k]);	
				}
				
			}
			
			
		}
		
	}
}
