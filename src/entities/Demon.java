package entities;

public abstract class Demon extends LivingEntity {
	
	final String name;
	Demon partner;
	int cruelty; // cruelty defines a demon's position within the hierarchy

	public Demon(String name, String gender, int[] currentPosition) {
		super(gender, currentPosition);
		this.name = name;
	}
	
	public void killSinner(Sinner victim) { // demon kills a victim and gains cruelty
		victim.isAlive = false;
		this.cruelty++;
	}
	
}
