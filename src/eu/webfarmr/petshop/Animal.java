package eu.webfarmr.petshop;

public abstract class Animal {
	
	private String name;
	private String gender;

	public Animal(String name, String gender) {
		this.setName(name);
		this.setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public abstract void makeSound();

}
