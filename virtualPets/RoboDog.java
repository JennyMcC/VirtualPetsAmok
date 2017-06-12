package virtualPets;

public class RoboDog extends Dog implements Robo {

	private int oilLevel;

	public RoboDog(String name, String type) {
		super(name, type);
		this.oilLevel = 100;
	}

	int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void applyOil() {
		oilLevel = 100;
	}

	@Override
	public void walk() {
		oilLevel = oilLevel - 10;
	}

	@Override
	void tick() {
		oilLevel = oilLevel - 10;
	}

	public String individualDogStats() {
		return name + "\t\t" + type + "\t" + oilLevel;
	}
}
