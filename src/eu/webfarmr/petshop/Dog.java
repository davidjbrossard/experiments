package eu.webfarmr.petshop;

public class Dog extends Animal{
	
	/**
	 * Create a new dog with a name
	 * @param name
	 */
	public Dog(String name, String gender) {
		super(name, gender);
	}

	@Override
	public void makeSound() {
		System.out.println(getName()+" is making the following sound: ");
		System.out.println("bark");
	}
}
