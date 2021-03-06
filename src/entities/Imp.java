package entities;

public class Imp extends Demon {
	/* class for the lesser demon, 3rd in hierarchy and first mature
	 * Imp has following variables:
	 * 		String name,
	 * 		String gender,
	 * 		int age,
	 * 		boolean isAlive,
	 * 		int[] currentPosition,
	 * 		Demon partner,
	 * 		int cruelty
	 */

	public Imp(String name, String gender, int[] currentPosition) {
		super(name, gender, currentPosition);
	}
	
	public void cannibalize(Imp impVictim) {
		// destroys Imp object at same position and increases cruelty
		impVictim.isAlive = false;
		this.cruelty++;
	}
	
}
