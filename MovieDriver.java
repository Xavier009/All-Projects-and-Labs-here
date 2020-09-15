import java.util.Scanner;

public class MovieDriver {
	public static void main (String [] args) {

	//NOTE CLASS IS IN ANOTHER FILE TITLED Movie.class

	String yesNo;
	Scanner scan = new Scanner(System.in);//create scanner
	do {
		//Create a new object of type Scanner that reads from the keyboard
				
		    	
		    	
		    	
				//Create a new movie object
				Movie movie1 = new Movie();
				
				
				
				//Prompt the user to enter the title of a movie 
				System.out.println("What is the title of the movie?: ");
				String movieTitle = scan.nextLine();
				
				
				//Read in the line that the user types
				//Set the title in the movie object
				movie1.setTitle(movieTitle);
				
				
				
				//Prompt the user to enter the movie’s rating
				System.out.println("What is the movie's rating?: ");
				String rating = scan.nextLine();
				
				//Read in the line that the user types
				//Set the rating in the movie object
				movie1.setRating(rating);
				
				//Prompt the user to enter the number of tickets sold at a (unnamed) theater
				System.out.println("How many tickets were sold at the theater?: ");
				int ticketsSold = scan.nextInt();
				
				
				
				//Read in the integer that the user types
				//Set the number of tickets sold in the movie object
				movie1.setSoldTickets(ticketsSold);
				
				//Print out the information using the movie’s toString method
				System.out.println(movie1.toString());
				
				
				
				System.out.println("Would you like to enter another movie?: ");
				
					
				scan.nextLine(); //If this is not here the program skips the following input
			
				
				yesNo = scan.nextLine();//this is read, after this there is an error
				
				
				
	}while(yesNo.equalsIgnoreCase("yes"));
	
	
	scan.close();//close scanner
	
	}
	
}
