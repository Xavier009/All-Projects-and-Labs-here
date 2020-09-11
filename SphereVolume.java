import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereVolume {
	public static void main (String [] args) {
		
	//Print purpose of program
	//Print a prompt asking for diameter
	//read diameter
	//Calculate radius from diameter
	//Calculate volume V = (4/3)pi r^3
	//Print volume
	
	System.out.println("The Purpose of this program is to calculate the volume of a sphere given the diameter");
	System.out.println("Please enter the diameter of your sphere: ");
	
	Scanner sc = new Scanner(System.in);
	double diam = sc.nextDouble();
	sc.close();
	
	//System.out.println("The entered diameter is " + diam);
	
	double radius = (diam * (.5));
	
	//System.out.println("The entered calculated radius is " + radius);
	
	double fraction = (4.0/3.0);
	
	double volume = ((fraction) * Math.PI) * (Math.pow(radius, 3));
	
	System.out.println("This is the calculated volume of the sphere: " + new DecimalFormat("0.0").format(volume) + " units cubed");
	System.out.println("Goodbye");
	}
}
