package oops;

public class AppVersion2 extends AppVersion1 {
	
	//polymorphism - overriding
	public void function2()
	{
		System.out.println("Modified: Doing function 2");
	}
	
	public void function3()
	{
		System.out.println("Doing function 3");
	}
	
	//overloading
	public void function3(String functionality)
	{
		System.out.println("Doing "+functionality);
	}
}
