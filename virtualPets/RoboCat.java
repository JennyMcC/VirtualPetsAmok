package virtualPets;

public class RoboCat extends Cat implements Robo {

	private int oilLevel;

	public RoboCat(String name, String type) {
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
	void tick() {
		oilLevel = oilLevel - 10;
	}

	public String individualCatStats() {
		return name + "\t\t" + type + "\t" + oilLevel;
	}
}
