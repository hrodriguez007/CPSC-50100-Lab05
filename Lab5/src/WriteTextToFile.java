//Lab 5
//Exercise 2 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class WriteTextToFile {
	  public static void main(String[] args) throws IOException {

	       //output path file
	       BufferedWriter writer = new BufferedWriter(new FileWriter("userStrings.txt"));

	       //string from user
	       Scanner input = new Scanner(System.in);
	       String userstring;

	       		System.out.println("\nEnter strings (DONE to quit): ");
	       		boolean choice=(true);
	      
	       //loop running until user done
	       do
	       {
	           userstring=input.nextLine();

	           if(userstring.toLowerCase().equals("done"))
	           {
	               choice=false;
	               break;
	           }
	           else
	           {
	               //write string to file
	               writer.write(userstring);
	               writer.newLine();
	           }
	       }while(choice);

	       //close the file and input
	       writer.close();
	       input.close();
	   }
	}