package finalProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class UnitTests { // obviously this is where I am Unit Testing my code
	
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20

	public static void main(String[] args) {
		//binarySearch and result method must work together to operate so the result unit test Test 
		// a part of both methods

		System.out.println("Test 7: ");
		result(3);

		System.out.println("Test 6: ");
		GameTitleTest(4);
		System.out.println();

		System.out.println("Test 5: ");
		critChance(65);
		// This Unit test tests the create method as well
		System.out.println();

		System.out.println("Test 4: ");
		DyingTest(5);
		System.out.println();

		System.out.println("Test 3: ");
		ChooseFighterTest(2);
		System.out.println();

		System.out.println("Test 2: ");
		enemiesTest(2);
		System.out.println();

		System.out.println("Test 1: ");
		attackTest(1);

	}

	public static void DyingTest(int n) {
		if (n == 0) {
			// System.out.println(n);
		} else {
			// System.out.println(n);
			n--;
			DyingTest(n);
			if (n <= 5) {
				System.out.println("Test passed");
			} else {
				System.out.println("Test failed");
			}

		}

	}

	public static void ChooseFighterTest(int pCharacter) {

		// System.out.println("Welcome to Diablo, Choose your Fighter");
		// System.out.println("1) Demon Hunter 2) Barbarian 3) Wzard");

		if (pCharacter == 1) {
			// System.out.println("Lets enter the Dungeon, Demon Hunter ");

		}

		if (pCharacter == 2) {
			// System.out.println("Lets enter the Dungeon, Barbarian ");
		}

		if (pCharacter == 3) {
			// System.out.println("Lets enter the Dungeon, Wizard ");

		}
		if (pCharacter > 3) {
			System.out.println("Test failed");
		} else if (pCharacter < 1) {
			System.out.println("Test failed");
		} else {
			System.out.println("Test passed");
		}

	}

	public static void enemiesTest(int chooseEnemy) {
		Stack<String> enemies = new Stack<String>();
		enemies.add("The Skeleton King");
		enemies.add("The Butcher");
		enemies.add("Wraiths");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// System.out.println(
		// "Enter which enemy do you want to fight: 0) The Skeleton King 1) The Butcher
		// 2) Wraiths");

		if (chooseEnemy == 0) {
			// System.out.println("The Skeleton King chalenges you to a fight!");
		}
		if (chooseEnemy == 1) {
			// System.out.println("The Butcher chalenges you to a fight!");
		}
		if (chooseEnemy == 2) {
			// System.out.println("The Wraiths chalenges you to a fight!");
		}
		if (chooseEnemy > 2 || chooseEnemy < 0) {
			System.out.println("Test failed");
		} else {
			System.out.println("Test passed");
		}

	}

	public static void attackTest(int input) {

		int health = 100;
		int attackDamage = 25;
		int NumHealthPotions = 3;
		int HealthPotionHealAmount = 20;
		int MaxEnemyHealth = 150;
		int enemyAttackDamage = 25;

		Random rand = new Random();

		boolean Running = true;
		while (Running) {

			Scanner scan = new Scanner(System.in);
			int enemyHealth = MaxEnemyHealth;

			while (enemyHealth > 0 && health > 1) {
				// System.out.println("Your Hp: " + health);
				// System.out.println("Enemies Hp: " + enemyHealth);
				// System.out.print("Whats your move? 1) shoot your bow 2) Use a health potion
				// 3) Accept defeat 4) attempt to Crit");
				// System.out.println(" 5) View health potions");

				if (input == 1) {
					int DamageDelt = rand.nextInt(attackDamage);
					int DamageTaken = rand.nextInt(enemyAttackDamage);

					MaxEnemyHealth -= DamageDelt;
					health -= DamageTaken;
					System.out.println("Test passed");

					// System.out.println("Your bow hit the enemy for " + DamageDelt + " damage!");
					// System.out.println("You got hit for " + DamageTaken + " damage");
					if (MaxEnemyHealth <= 0) {
						// System.out.println("Enemy has been slain, You Win!");
						break;
					}
					if (health <= 0) {
						// System.out.println("You have been slain, You lose");
						break;
					}

				} else if (input == 2)

				{

					if (NumHealthPotions > 0) {
						health += HealthPotionHealAmount;
						NumHealthPotions--;
						System.out.println("Test passed");
						// System.out.println("drinking health potion");
						// System.out.println("Your hp: " + health);
						// System.out.println("you have " + NumHealthPotions + " left");
						break;
					} else {
						System.out.println("you are out of health potions");
						break;
					}
				} else if (input == 4) {
					System.out.println("Test passed");
					// BubblesortUserinput object = new BubblesortUserinput();
					// object.critChance();

					break;
				} else if (input > 5 || input < 1) {
					System.out.println("Test failed");
				}

				else if (input == 5) {
					System.out.println("Test passed");
					// listHealthPotions();
					break;
				}

				else if (input == 3)
					;

				{
					acceptDefeat obj = new acceptDefeat();
					// obj.Dying(health);
					health = 0;
					break;
				}

			}

		}

	}

	public static void listHealthPotions() {
		int NumHealthPotions = 3;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < NumHealthPotions; i++) {
			a.add(i);
		}
		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println("Health potion Number: " + i.next());

		}
		System.out.println("These potions are in your inventory");
	}

	@SuppressWarnings("unused")
	public static void critChance(int num) {
		int health = 100;
		int attackDamage = 25;
		int NumHealthPotions = 3;
		int HealthPotionHealAmount = 20;
		int MaxEnemyHealth = 150;
		int enemyAttackDamage = 25;

		Random rand = new Random();

		// System.out.println("CHoose a number from this sorted list");
		// System.out.println();
		// create();
		Scanner scan = new Scanner(System.in);

		if (num > 50) {
			System.out.println("Test passed");
			int DamageDelt = rand.nextInt(attackDamage) + 15;
			int DamageTaken = rand.nextInt(enemyAttackDamage);
			// System.out.println("Crit hit, Powerful shot");
			MaxEnemyHealth -= DamageDelt;
			health -= DamageTaken;
			// System.out.println("Your bow hit the enemy for " + DamageDelt + " damage!");
			// System.out.println("You got hit for " + DamageTaken + " damage");
		} else if (num < 50) {
			System.out.println("Test passed");
			int DamageDelt = 2;
			int DamageTaken = rand.nextInt(enemyAttackDamage);
			// System.out.println("Crit failed, weak shot");
			MaxEnemyHealth -= DamageDelt;
			health -= DamageTaken;

			// System.out.println("Your bow hit the enemy for " + DamageDelt + " damage");
			// System.out.println("You got hit for " + DamageTaken + " damage");
		} else {
			System.out.println("Test failed");
		}

	}

	public static boolean create() {
		int[] myArray = new int[10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 100 + 1);
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		bubbleSort(myArray);
		return true;

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void GameTitleTest(int gameTitle) {
		gameTitle<String, Integer> obj = new gameTitle<String, Integer>("Welcome to Diablo", 4);

		obj.print();
		if (gameTitle == 4) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

	public static void result(int x) {
		Scanner scan = new Scanner(System.in);
		FindFighterIndex ob = new FindFighterIndex();
		int arr[] = { 1, 2, 3 };
		// System.out.println("Select which fighter you chose to see which index they
		// are at");
		// System.out.println("[1 (Demon Hunter), 2 (Barbarian), 3 (Wizard)");
		int n = arr.length;

		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
		// System.out.println("Element found at index " + result);
		if (result == 2) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}
	
}
