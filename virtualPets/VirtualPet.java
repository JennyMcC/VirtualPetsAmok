package virtualPets;

public abstract class VirtualPet {

	protected String name;
	protected String type;
	protected int health;

	public VirtualPet(String name, String type) {
		this.name = name;
		this.type = type;
		this.health = 100;
	}

	public String getType() {
		return type;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	abstract void tick();

	@Override
	public String toString() {
		return name + ":" + " Health: " + health + ", type " + type;
	}

}
