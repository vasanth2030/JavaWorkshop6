package basicJava;

import java.util.Scanner;

public class BasicJavaMain {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		int age;
		float height; //typecasting  //178.5f
		
		System.out.println("Enter your name: ");
		name= sc.nextLine();
		
		System.out.println("Enter your age and height: ");
		age= sc.nextInt();
		height= sc.nextFloat();
		
//		System.out.println("Enter your height: ");
		sc.close();

		System.out.println("Hello World");   //sysout
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}
    
}
