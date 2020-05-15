package finalProject;

import java.util.Scanner;

public class BubblesortUserinput extends baseCharacters{
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20
	
	public void critChance () { // This method gives the player the ability to crit which means to hit an extra powerful shot
		
		System.out.println("CHoose a number from this sorted list");
		System.out.println();
		create(); // calling the create method
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		if (num > 50) {
			int DamageDelt = rand.nextInt(attackDamage) + 15;
			int DamageTaken = rand.nextInt(enemyAttackDamage);
			System.out.println("Crit hit, Powerful shot");
			MaxEnemyHealth -= DamageDelt;
			health -= DamageTaken;
			System.out.println("Your bow hit the enemy for " + DamageDelt + " damage!");
			System.out.println("You got hit for " + DamageTaken + " damage");
		}
		else if(num < 50) {
			int DamageDelt = 2;
			int DamageTaken = rand.nextInt(enemyAttackDamage);
			System.out.println("Crit failed, weak shot");
			MaxEnemyHealth -= DamageDelt;
			health -= DamageTaken;
			
			System.out.println("Your bow hit the enemy for " + DamageDelt + " damage");
			System.out.println("You got hit for " + DamageTaken + " damage");
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

	public static void bubbleSort(int [] array) {
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
}