package basicJava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("Division value: " + div(num1, num2));
		System.out.println("End of program");
	}

	public static int div(int a, int b) {
		int div=-1;
		try {
			div = a / b;
//			return div;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
//			return -1;
		} finally {
			return div;
		}

	}
}
