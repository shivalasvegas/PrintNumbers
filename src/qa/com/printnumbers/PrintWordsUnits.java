package qa.com.printnumbers;

public class PrintWordsUnits {
	
public static String numberWordsUnits[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

public void printUnits() {
		
		for (int i=0; i<10; i++) {
			System.out.println(numberWordsUnits[i]);
		}
	}
}
