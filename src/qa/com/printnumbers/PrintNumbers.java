package qa.com.printnumbers;

public class PrintNumbers {

	public static void main(String[] args) {
		
		//printNumbersTen();
		//printNumbersHun();
		printWordsTen();

	}
	
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
	
	static void printWordsTen() {
		String numberWords[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		for (int i=0; i<10; i++) {
			System.out.println(numberWords[i]);
		}
	}
	
	
	

}
