package virtualPets;

public class OrganicCat extends Cat implements Organic {

	private int hunger;
	private int thirst;
	private int bathroomNeeded;
	private int litterboxFilth;

	public OrganicCat(String name, String type, int bathroomNeeded, int thirst, int hunger) {
		super(name, type);
		{
			this.thirst = thirst;
			this.hunger = hunger;
			this.bathroomNeeded = bathroomNeeded;
			this.litterboxFilth = 0;
			this.health = 60;
		}
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBathroomNeeded() {
		return bathroomNeeded;
	}

	public int getLitterboxFilth() {
		return litterboxFilth;
	}

	@Override
	public void feed() {
		hunger = hunger - 10;
		thirst = thirst + 5;
		litterboxFilth = litterboxFilth + 10;
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
		litterboxFilth = 0;
		health = health + 5;
	}

	@Override
	void tick() {
		litterboxFilth = litterboxFilth + 10;
		bathroomNeeded = bathroomNeeded + 10;
		hunger = hunger + 10;
		thirst = thirst + 10;
	}

	public String individualCatStats() {
		return name + "\t\t" + type + "\t" + bathroomNeeded + "\t\t" + thirst + "\t\t" + hunger + "\t\t"
				+ litterboxFilth + "\t\t\t" + health;
	}

}
