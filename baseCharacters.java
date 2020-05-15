package finalProject;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public abstract class baseCharacters {
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20

	static int health = 100;
	static int attackDamage = 25;
	static int NumHealthPotions = 3;
	static int HealthPotionHealAmount = 20;
	static int MaxEnemyHealth = 150;
	static int enemyAttackDamage = 25;

	static Random rand = new Random();

	public static void enemies() { // this method is where you choose your enemy
		Stack<String> enemies = new Stack<String>(); // Stack is presented here
		enemies.add("The Skeleton King");
		enemies.add("The Butcher");
		enemies.add("Wraiths");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter which enemy do you want to fight: 0) The Skeleton King     1) The Butcher     2) Wraiths");
		int chooseEnemy = scan.nextInt(); // chooseEnemy = whatever number the user enters

		if (chooseEnemy == 0) {
			System.out.println("The Skeleton King chalenges you to a fight!");
		}
		if (chooseEnemy == 1) {
			System.out.println("The Butcher chalenges you to a fight!");
		}
		if (chooseEnemy == 2) {
			System.out.println("The Wraiths chalenges you to a fight!");
		}

	}

	public static void listHealthPotions() { // This method is used to show the player how many health potions they have remaining
		ArrayList <Integer> a = new ArrayList <Integer> ();
		for (int i = 0; i < NumHealthPotions; i++) {
			a.add(i);
		}
		 Iterator <Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println("Health potion Number: " + i.next());

		}
		System.out.println("These potions are in your inventory");
	}

	@SuppressWarnings("resource")
	public static void attack() {

		boolean Running = true;
		while (Running) {

			Scanner scan = new Scanner(System.in);
			int enemyHealth = MaxEnemyHealth;

			while (enemyHealth > 0 && health > 1) {
				System.out.println("Your Hp: " + health);
				System.out.println("Enemies Hp: " + enemyHealth);
				System.out.print("Whats your move? 1) shoot your bow     2) Use a health potion     3) Accept defeat     4) attempt to Crit");
				System.out.println("    5) View health potions");
				int input = scan.nextInt();

				if (input == 1) {
					int DamageDelt = rand.nextInt(attackDamage);
					int DamageTaken = rand.nextInt(enemyAttackDamage);

					MaxEnemyHealth -= DamageDelt; // subtracting damage delt from enemies health
					health -= DamageTaken; // subtracting damage taken from your health

					System.out.println("Your bow hit the enemy for " + DamageDelt + " damage!");
					System.out.println("You got hit for " + DamageTaken + " damage");
					if (MaxEnemyHealth <= 0) {
						System.out.println("Enemy has been slain, You Win!");
						break;
					}
					if (health <= 0) {
						System.out.println("You have been slain, You lose");
						break;
					}
					break;

				} else if (input == 2)

				{

					if (NumHealthPotions > 0) {
						health += HealthPotionHealAmount;
						NumHealthPotions--;
						System.out.println("drinking health potion");
						System.out.println("Your hp: " + health);
						System.out.println("you have " + NumHealthPotions + " left");
						break;
					} else {
						System.out.println("you are out of health potions");
						break;
					}
				} else if (input == 4) {
					BubblesortUserinput object = new BubblesortUserinput();
					object.critChance();

					break;
				}
				else if (input == 5) {
					listHealthPotions(); // This is where the health potions method is called to check how many potions you have left
					break;
				}

				else if (input == 3)
					;

				{
					acceptDefeat obj = new acceptDefeat(); // creating an object to access Dying method
					obj.Dying(health);
					health = 0;
					break;
				}

			}
		}
	}

}
