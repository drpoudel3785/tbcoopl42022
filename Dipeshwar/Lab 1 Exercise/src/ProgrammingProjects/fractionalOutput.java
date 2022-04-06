package ProgrammingProjects;

import java.util.Scanner;

public class fractionalOutput {
	public static void main(String[] args) {
		
		float numerator,denominator;
		double fracOut;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter numerator value: ");
		numerator = scan.nextInt();
		
		System.out.println("Enter denominator value: ");
		denominator = scan.nextInt();
		
		fracOut = numerator/denominator;
		System.out.println("The fraction "+" is: "+fracOut);
	}

}
