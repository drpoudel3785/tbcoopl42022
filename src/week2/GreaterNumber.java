package week2;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		int total, sum;
		total = 40;
		sum = 40;
		char x = 'y';
		if(total == sum)
			System.out.println("Total is equals to sum");
		else
			System.out.println("Total is not equal to sum");
		if(x!='x')
			System.out.println("Letter is not x");
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		num2 = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is greater than " +num2+ " , "+ num3);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println(num2 + " is greater than " +num1+ " , "+ num3);
		}
		else
		{
			System.out.println(num3 + " is greater than " +num2+ " , "+ num1);		
		}	

	}

}
