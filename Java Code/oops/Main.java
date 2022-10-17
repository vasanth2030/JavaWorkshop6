package oops;

public class Main {
	public static void main(String[] args) {
		Animal animal1= new Animal();
		animal1.setName("Dog");
		animal1.setHabitat("Land");
		System.out.println(animal1.getName());
		System.out.println(animal1.getHabitat());
		animal1.eat();
		animal1.sleep();
		
		System.out.println();
		
		Animal animal2=new Animal("Cat","Land");
		System.out.println(animal2.getName());
		System.out.println(animal2.getHabitat());
		animal2.eat();
		animal2.sleep();
	}
}
