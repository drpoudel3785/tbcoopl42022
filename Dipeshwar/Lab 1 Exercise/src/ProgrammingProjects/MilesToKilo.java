package ProgrammingProjects;

import java.util.Scanner;

public class MilesToKilo {
	public static void main(String[] args)
    {
       float Miles;
       Scanner scan = new Scanner(System.in) ;

       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average");
       
       System.out.print("Enter value in Mile: ");
       Miles = scan.nextFloat();

       //print the average
       System.out.println("The value in Kilometers is "+ (Miles*1.60935) +" km.");
       
    }
}
