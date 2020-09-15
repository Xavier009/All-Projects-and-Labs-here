import java.util.Scanner;

public class WifiDriver {
	public static void main (String [] args) {
		
		String message = "Are you able to connect with the internet? (yes or no): ";
		
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println(message);
		
		Scanner scan = new Scanner(System.in);//create scanner
    	String yesNo = scan.nextLine();
				
		if (correct(yesNo))//If true, run the code in here, else keep going
		{
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);//end program
		}
		
		System.out.println("Second step: reboot your router and try to reconnect.");
		System.out.println(message);
	    yesNo = scan.nextLine();
	    	
	    if (correct(yesNo))
		{
			System.out.println("Rebooting your router seemed to work");
			System.exit(0);
		}
			
		System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println(message);
		yesNo = scan.nextLine();
				
		if (correct(yesNo))
		{
			System.out.println("Checking the routers cables seemed to work");
			System.exit(0);
		}	
			
		System.out.println("Fourth step: move your computer closer to your router");
		System.out.println(message);
		yesNo = scan.nextLine();
				
		if (correct(yesNo))
		{
			System.out.println("Moving the computer closer seemed to work");
			System.exit(0);
		}		
		
		scan.close(); //close scanner
		
		
		System.out.println("This Diagnositics check did not seem to resolve your issue");
		System.out.println("Fifth step: contact your ISP, Make sure your ISP is hooked up to your router");
		System.exit(0);
	}
	
		//This gives me less work
		public static boolean correct (String yesNo)
		{
			if (yesNo.equalsIgnoreCase("Yes") || yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("YES"))
				//You never know what someone will type lol
				return true;
			else 
				return false;
		}
}
