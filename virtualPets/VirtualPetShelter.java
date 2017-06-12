package virtualPets;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, RoboDog> roboDogRoster = new HashMap<String, RoboDog>();

	public void intakeNewRoboDog(RoboDog dog) {
		roboDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	public void removeRoboDog(RoboDog dog) {
		roboDogRoster.remove(dog.getName().toLowerCase(), dog);
	}

	Map<String, RoboCat> roboCatRoster = new HashMap<String, RoboCat>();

	public void intakeNewRoboCat(RoboCat cat) {
		roboCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	public void removeRoboCat(RoboCat cat) {
		roboCatRoster.remove(cat.getName().toLowerCase(), cat);
	}

	Map<String, OrganicDog> organicDogRoster = new HashMap<String, OrganicDog>();

	public void intakeNewOrganicDog(OrganicDog dog) {
		organicDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	public void removeOrganicDog(OrganicDog dog) {
		organicDogRoster.remove(dog.getName().toLowerCase(), dog);
	}

	Map<String, OrganicCat> organicCatRoster = new HashMap<String, OrganicCat>();

	public void intakeNewOrganicCat(OrganicCat cat) {
		organicCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	public void removeOrganicCat(OrganicCat cat) {
		organicCatRoster.remove(cat.getName().toLowerCase(), cat);
	}

	public String organicDogRoster() {
		String rosterMenu = "Name \t\t Type \t\t Bathroom \t Thirst \t Hunger \t Cage Filth \t Health";
		String menuDivider = "---------------------------------------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our Organic Dogs and how they are feeling: " + "\n");
		for (OrganicDog entry : organicDogRoster.values()) {
			menuLine = entry.individualDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String organicCatRoster() {
		String rosterMenu = "Name \t\t Type \t\t Bathroom \t Thirst \t Hunger \t Litterbox Filth \t Health";
		String menuDivider = "----------------------------------------------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our Organic Cats and how they are feeling: " + "\n");
		for (OrganicCat entry : organicCatRoster.values()) {
			menuLine = entry.individualCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String roboDogRoster() {
		String rosterMenu = "Name \t\t Type \t\t Oil Level";
		String menuDivider = "-------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our Robotic Dogs and how they are feeling: " + "\n");
		for (RoboDog entry : roboDogRoster.values()) {
			menuLine = entry.individualDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String roboCatRoster() {
		String rosterMenu = "Name \t\t Type \t\t Oil Level";
		String menuDivider = "-------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our Robotic Cats and how they are feeling: " + "\n");
		for (RoboCat entry : roboCatRoster.values()) {
			menuLine = entry.individualCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	// public void list() {
	// for (VirtualPet currentPet : organicCatRoster.keySet();
	// }
	//
	// public void tick() {
	// for (VirtualPet currentPet : tick()) {
	// currentPet.tick();
	// }}
}