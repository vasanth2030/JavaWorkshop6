package basicJava;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		div(num1, num2);
		
		int sum= sum(num1,num2);
		System.out.println(sum);
	}
	
	static void div(int a,int b)
	{
		int div=a/b;
		System.out.println("Div: "+div);
	}
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
}
