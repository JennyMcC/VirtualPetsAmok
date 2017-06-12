package virtualPets;

import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter allPetShelter = new VirtualPetShelter();

		OrganicDog dogStan = new OrganicDog("Stan", "organic dog", 10, 20, 35);
		OrganicDog dogKyle = new OrganicDog("Kyle", "organic dog", 10, 20, 25);
		allPetShelter.intakeNewOrganicDog(dogStan);
		allPetShelter.intakeNewOrganicDog(dogKyle);
		System.out.println(allPetShelter.organicDogRoster());

		OrganicCat catCartman = new OrganicCat("Cartman", "organic cat", 10, 20, 50);
		OrganicCat catKenny = new OrganicCat("Kenny", "organic cat", 10, 20, 30);
		allPetShelter.intakeNewOrganicCat(catCartman);
		allPetShelter.intakeNewOrganicCat(catKenny);
		System.out.println(allPetShelter.organicCatRoster());

		RoboDog dogButters = new RoboDog("Butters", "robotic dog");
		RoboDog dogCraig = new RoboDog("Craig", "robotic dog");
		allPetShelter.intakeNewRoboDog(dogButters);
		allPetShelter.intakeNewRoboDog(dogCraig);
		System.out.println(allPetShelter.roboDogRoster());

		RoboCat catTweek = new RoboCat("Tweek", "robotic cat");
		RoboCat catWendy = new RoboCat("Wendy", "robotic cat");
		allPetShelter.intakeNewRoboCat(catTweek);
		allPetShelter.intakeNewRoboCat(catWendy);
		System.out.println(allPetShelter.roboCatRoster());

		do {

			System.out.println(
					"Choose one: \n1.Feed the organic pets \n2.Water the organic pets \n3.Walk the dogs \n4.Clean cat litterboxes \n5.Clean dog cages \n6.Oil the robotic dogs \n7.Oil the robotic cats \n8.Adopt a pet \n9.Quit");

			int interact = input.nextInt();
			if (interact == 1) {
				dogStan.feed();
				dogKyle.feed();
				catKenny.feed();
				catCartman.feed();
				System.out.println("Nice job! You fed all the organic pets.");

			} else if (interact == 2) {
				catKenny.water();
				catCartman.water();
				dogStan.water();
				dogKyle.water();
				System.out.println("You gave all the organic pets water!");

			} else if (interact == 3) {
				dogStan.walk();
				dogKyle.walk();
				dogButters.walk();
				dogCraig.walk();
				System.out.println("You walked the dogs! What a good citizen.");

			} else if (interact == 4) {
				catCartman.clean();
				catKenny.clean();
				System.out.println("Thanks for cleaning the litterboxes, that's the worst.");

			} else if (interact == 5) {
				dogStan.clean();
				dogKyle.clean();
				System.out.println("Thanks for cleaning the dog cages, you're the best.");

			} else if (interact == 6) {
				dogButters.applyOil();
				dogCraig.applyOil();
				System.out.println("Thanks! The robotic dogs are ready to go!");

			} else if (interact == 7) {
				catTweek.applyOil();
				catWendy.applyOil();
				System.out.println("Thanks! The robotic cats are all set!");

			} else if (interact == 8) {
				System.out.println("Which pet would you like to adopt?" + allPetShelter.organicDogRoster.keySet()
						+ allPetShelter.organicCatRoster.keySet() + allPetShelter.roboDogRoster.keySet()
						+ allPetShelter.roboCatRoster.keySet());
				String adopt = input.next();
				if (adopt.toLowerCase().equals("kenny")) {
					allPetShelter.removeOrganicCat(catKenny);
					System.out.println("Congratulations! You've adopted Kenny the cat!");
				} else if (adopt.toLowerCase().equals("cartman")) {
					allPetShelter.removeOrganicCat(catCartman);
					System.out.println("Congratulations! You've adopted Cartman the cat!");
				} else if (adopt.toLowerCase().equals("stan")) {
					allPetShelter.removeOrganicDog(dogStan);
					System.out.println("Congratulations! You've adopted Stan the dog!");
				} else if (adopt.toLowerCase().equals("kyle")) {
					allPetShelter.removeOrganicDog(dogKyle);
					System.out.println("Congratulations! You've adopted Kyle the dog!");
				} else if (adopt.toLowerCase().equals("butters")) {
					allPetShelter.removeRoboDog(dogButters);
					System.out.println("Congratulations! You've adopted Butters the robo dog!");
				} else if (adopt.toLowerCase().equals("craig")) {
					allPetShelter.removeRoboDog(dogCraig);
					System.out.println("Congratulations! You've adopted Craig the robo dog!");
				} else if (adopt.toLowerCase().equals("wendy")) {
					allPetShelter.removeRoboCat(catWendy);
					System.out.println("Congratulations! You've adopted Wendy the robo cat!");
				} else if (adopt.toLowerCase().equals("tweek")) {
					allPetShelter.removeRoboCat(catTweek);
					System.out.println("Congratulations! You've adopted Tweek the robo cat!");
				}

			} else {
				System.out.println("Nobody likes a quitter.");
				break;
			}

			// ((OrganicDog) allPetShelter.organicDogRoster).tick();
			// ((OrganicCat) allPetShelter.organicCatRoster).tick();
			// ((RoboCat) allPetShelter.roboCatRoster).tick();
			// ((RoboDog) allPetShelter.roboDogRoster).tick();
			catKenny.tick();
			catCartman.tick();
			dogStan.tick();
			dogKyle.tick();
			catTweek.tick();
			catWendy.tick();
			dogButters.tick();
			dogCraig.tick();

			System.out
					.println("For the status of all pets, type 'status'; if you'd like a list of options type 'list'.");
			String options = input.next();
			if (options.toLowerCase().equals("status")) {
				System.out.println(allPetShelter.organicDogRoster());
				System.out.println(allPetShelter.organicCatRoster());
				System.out.println(allPetShelter.roboDogRoster());
				System.out.println(allPetShelter.roboCatRoster());
			} else if (options.toLowerCase().equals("list")) {
				System.out.println("What would you like to do?");
			}

		} while ((catCartman.getHunger() <= 100) && (catKenny.getHunger() <= 100) && (dogStan.getHunger() <= 100)
				&& (dogKyle.getHunger() <= 100) && (dogButters.getOilLevel() >= 0) && (dogCraig.getOilLevel() >= 0)
				&& (catWendy.getOilLevel() >= 0) && (catTweek.getOilLevel() >= 0));
		if (catCartman.getHunger() >= 100) {
			System.out.println("Cartman has starved to death, YOU CAN'T WORK HERE ANYMORE!");
		} else if (catKenny.getHunger() >= 100) {
			System.out.println("Kenny has starved to death, YOU CAN'T WORK HERE ANYMORE!");
		} else if (dogStan.getHunger() >= 100) {
			System.out.println("Stan has starved to death, YOU CAN'T WORK HERE ANYMORE!");
		} else if (dogKyle.getHunger() >= 100) {
			System.out.println("Kyle has starved to death, YOU CAN'T WORK HERE ANYMORE!");
		} else if (dogButters.getOilLevel() <= 0) {
			System.out.println("Butters rusted to death, you lazy asshole. Get out.");
		} else if (dogCraig.getOilLevel() <= 0) {
			System.out.println("Craig rusted to death, you lazy asshole. Get out.");
		} else if (catWendy.getOilLevel() <= 0) {
			System.out.println("Wendy rusted to death, you lazy asshole. Get out.");
		} else if (catTweek.getOilLevel() <= 0) {
			System.out.println("Wendy rusted to death, you lazy asshole. Get out.");
		}
		input.close();
	}
}
