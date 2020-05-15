package finalProject;

import java.util.Scanner;

public class chooseYourFighter {
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20

	
	public static void ChooseFighter() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Diablo, Choose your Fighter");
		System.out.println("1) Demon Hunter     2) Barbarian     3) Wzard");

		int pCharacter = scan.nextInt();
		if (pCharacter == 1) {
			System.out.println("Lets enter the Dungeon, Demon Hunter ");

		}

		if (pCharacter == 2) {
			System.out.println("Lets enter the Dungeon, Barbarian ");
		}

		if (pCharacter == 3) {
			System.out.println("Lets enter the Dungeon, Wizard ");

		}

	}

}
