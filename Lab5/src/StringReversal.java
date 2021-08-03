//Lab 5
//Exercise 4
import java.util.Scanner;

//the driver program
public class StringReversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			System.out.println("Please enter a string: ");
			
		String s = in.nextLine();
		String rev_string = reverseString(s);
			System.out.println("Reversed string: " + rev_string);
			
			in.close(); //closing scanner
		}

	//recursive method
	public static String reverseString(String s) {
		if (s.isEmpty())
			return s;
			return reverseString(s.substring(1)) + s.charAt(0);
	
	}

}
