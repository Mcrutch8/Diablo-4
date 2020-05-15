package finalProject;
public class acceptDefeat implements acceptDefeat2{
	// Max Crutchfield
	// red id: 822330295
	// 05/14/20
	public void Dying(int n) {
		if (n == 0) { // n in the baseCharacter class represents your health so when its at 0 you are dead
			System.out.println("You have died, Health =  " + n);
		} else {
			System.out.println("Health: " + n);
			n--; //health is dropping to 0
			Dying(n);

		}

	}

	

}
