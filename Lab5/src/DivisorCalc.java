//Lab 5
//Exercise 3
import java.util.Scanner;
public class DivisorCalc {

	public static void main(String[] args) {
		//Declaring the variables
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		//enter first piece user input
		System.out.print("Please enter the first number: ");
		num1 = scanner.nextInt();
		
		//enter second piece user input
		System.out.print("Please enter the second number: ");
		num2 = scanner.nextInt();
		
		//closing scanner
		scanner.close(); 
		
		//method for passing user entered input as arguments
		int greatestComDiv = gcd(num1, num2);
			System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + greatestComDiv);
			
		}
	//static method to calculate gcd of numbers using recursion in math
	private static int gcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return gcd(num2, num1 % num2);
		

	}

}
