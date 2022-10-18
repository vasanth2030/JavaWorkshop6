package oops;

public abstract class AppVersion2 extends AppVersion1 {
	
	//polymorphism - overriding
	@Override
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
	
	public abstract void function4();
}
