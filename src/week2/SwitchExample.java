package week2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values between 1 - 7 : ");
		day = sc.nextInt();
		switch(day)
		{
			case 1:
			{
				System.out.println("The day is Sunday");
				break;
			}
			case 2:
			{
				System.out.println("The day is Monday");
				break;
			}
			case 3:
			{
				System.out.println("The day is Tuesday");
				break;
			}
			case 4:
			{
				System.out.println("The day is Wednesday");
				break;
			}
			case 5:
			{
				System.out.println("The day is Thursday");
				break;
			}
			case 6:
			{
				System.out.println("The day is Friday");
				break;
			}
			case 7:
			{
				System.out.println("The day is Saturday");
				break;
			}
			default:
			{
				System.out.println("This is not the day");
				break;
			}
			
		}
		sc.close();
		

	}

}
