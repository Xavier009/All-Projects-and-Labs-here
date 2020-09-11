import java.text.DecimalFormat;
import java.util.Scanner;

public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here
		Scanner sc = new Scanner(System.in);
    	
		final int NUMBER = 2; // number of scores
		
		//int score1 = 100; // first test score
		//int score2 = 95; // second test score
		
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		
		//Task #2 prompt user to input score1
		System.out.println("Enter score 1 here: ");
		
		//Task #2 read score1
		int score1 = sc.nextInt();
		 
		//Task #2 prompt user to input score2
		System.out.println("Enter score 2 here: ");
		
		//Task #2 read score2 
		int score2 = sc.nextInt();
		
		// Find an arithmetic average
		average = ((score1 + score2) / NUMBER);
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		
		// Convert Fahrenheit temperatures to Celsius
		double fraction = (5.0/9.0);
		fToC = (fraction * (BOILING_IN_F - 32));
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		
		//Task #2 prompt user to input another temperature
		System.out.println("Enter a temperature that you want to convert(In Fahrenheit): ");
		
		//Task #2 read the user’s temperature in Fahrenheit
		int temperature = sc.nextInt();
		sc.close();
		
		
		//Task #2 convert the user’s temperature to Celsius
		
		double convert = ((temperature - 32) * fraction);
		
		//Task #2 print the user’s temperature in Celsius
		
		output = temperature + " Degrees in Fahrenheit is " + new DecimalFormat("0.0").format(convert) + " Degrees in Celsius.";
		System.out.println(output);
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
