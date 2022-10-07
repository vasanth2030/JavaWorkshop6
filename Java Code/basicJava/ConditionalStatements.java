package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7: ");
		int n= sc.nextInt();
		
//		if(num<0)
//		{
//			System.out.println("Enter a non-negative number");
//		}
		
		
//		if(num%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
		
		
//		if(mark>=80)
//		{
//			System.out.println("Grade: A");
//		}
//		else if(mark>=70)
//		{
//			System.out.println("Grade: B");
//		}
//		else if(mark>=60)
//		{
//			System.out.println("Grade: C");
//		}
//		else if(mark>=50)
//		{
//			System.out.println("Grade: D");
//		}
//		else
//		{
//			System.out.println("Grade: E - Fail");
//		}
		
		switch(n)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter a valid input");
		}
		
		System.out.println("End of program");
	}
}
