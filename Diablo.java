package finalProject;

import java.util.Scanner;

public class Diablo extends baseCharacters {
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20

	public static void main(String[] args) { // This is where the game is played
		
		@SuppressWarnings("unchecked")
		gameTitle game = new gameTitle("Welcome to Diablo ", 4);
		game.print();
		System.out.println();
		ChooseFighter();
		FindFighterIndex bin = new FindFighterIndex();
		bin.result();
		enemies();
		attack();
		

	}

	public static void ChooseFighter() { // Obviously where you choose your fighter

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
