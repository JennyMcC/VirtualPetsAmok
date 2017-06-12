package virtualPets;

public class OrganicDog extends Dog implements Organic {

	private int hunger;
	private int thirst;
	private int cageFilth;
	private int bathroomNeeded;

	public OrganicDog(String name, String type, int bathroomNeeded, int thirst, int hunger) {
		super(name, type);
		this.bathroomNeeded = bathroomNeeded;
		this.hunger = hunger;
		this.thirst = thirst;
		this.cageFilth = 0;
		this.health = 60;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getCageFilth() {
		return cageFilth;
	}

	public int getBathroomNeeded() {
		return bathroomNeeded;
	}

	@Override
	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
		cageFilth = cageFilth + 10;
		bathroomNeeded = bathroomNeeded + 5;
		health = health + 5;
	}

	@Override
	public void water() {
		thirst = thirst - 10;
		bathroomNeeded = bathroomNeeded + 5;
		health = health + 5;
	}

	@Override
	public void clean() {
		cageFilth = 0;
		health = health + 5;
	}

	@Override
	public void walk() {
		health = health + 10;
		bathroomNeeded = bathroomNeeded - 10;
	}

	@Override
	void tick() {
		cageFilth = cageFilth + 10;
		bathroomNeeded = bathroomNeeded + 10;
		hunger = hunger + 10;
		thirst = thirst + 10;
	}

	public String individualDogStats() {
		return name + "\t\t" + type + "\t" + bathroomNeeded + "\t\t" + thirst + "\t\t" + hunger + "\t\t" + cageFilth
				+ "\t\t" + health;
	}
}
