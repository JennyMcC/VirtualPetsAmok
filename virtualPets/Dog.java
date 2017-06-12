package virtualPets;

public abstract class Dog extends VirtualPet {

	public Dog(String petName, String petType) {
		super(petName, petType);
	}

	public abstract void walk();

}
