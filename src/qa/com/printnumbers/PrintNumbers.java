package qa.com.printnumbers;

public class PrintNumbers {

//	public static void main(String[] args) {
//		
//		//printNumbersTen();
//		//printNumbersHun();
//		//printWordsUnits();
//		//printWordsTeens();
//		//printWordsTens();
//		printWordsHundreds();
//
//	}
	
	static void printNumbersTen() {
		for (int i=2; i<10; i++) {
			
			System.out.println("i is: " + i);
			
		}
	}
	
	static void printNumbersHun() {
		for (int i=101; i<1000; i++) {
			
			System.out.println("i is: " + i);
			
		}
	}
	
	public static String numberWordsUnits[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	public static String numberWordsTeens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String numberWordsTens[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	
	static void printWordsUnits() {
		
		for (int i=0; i<10; i++) {
			System.out.println(numberWordsUnits[i]);
		}
	}
	
	static void printWordsTeens() {
	
		for (int i=0; i<10; i++) {
			System.out.println(numberWordsUnits[i]);
		}
		
		for (int i=0; i<9; i++) {
			System.out.println(numberWordsTeens[i]);
		}
		
		
		
	}
	
	static void printWordsTens() {
		
		for (int i=0; i<10; i++) {
			System.out.println(numberWordsUnits[i]);
		}
		
		for (int i=0; i<9; i++) {
			System.out.println(numberWordsTeens[i]);
		}
	
		for (int i=0; i<8; i++) {
			//System.out.println(numberWordsTens[i]);				
			for (int j=0; j<10; j++) {
				System.out.println(numberWordsTens[i] + " " + numberWordsUnits[j]);	
			}

		}
	}
		
		static void printWordsHundreds() {
			// print out units
			for (int i=0; i<10; i++) {
				System.out.println(numberWordsUnits[i]);
			}
			
			// print out teens
			for (int i=0; i<9; i++) {
				System.out.println(numberWordsTeens[i]);
			}
		
			// print out tens
			for (int i=0; i<8; i++) {
				//System.out.println(numberWordsTens[i]);	
				
				for (int j=0; j<10; j++) {
					System.out.println(numberWordsTens[i] + " " + numberWordsUnits[j]);	
				}
				
			}
			
			//print out hundreds
			
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
