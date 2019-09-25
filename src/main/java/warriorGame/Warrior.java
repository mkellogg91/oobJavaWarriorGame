package warriorGame;

public class Warrior implements WarriorInterface {
	
	int maxHealth;
	int strength;
	int defense;
	int hitpoints;
	String name;
	
	// constructor
	public Warrior(int maxHealth, int strength, int defense, int hitpoints, String name) {
		this.maxHealth = maxHealth;
		this.strength = strength;
		this.defense = defense;
		this.hitpoints = hitpoints;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getHitpoints() {
		return hitpoints;
	}
	
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	
	public void rest() {
		this.setHitpoints(this.maxHealth);
	}
	
	public void promote(Warrior killedW) {
		// warrior is promoted proportionally to the warrior he killed
		this.setDefense(killedW.getDefense() + this.getDefense());
		this.setHealth(killedW.getMaxHealth() + this.getMaxHealth());
		this.setHitpoints(this.getMaxHealth());
		this.setStrength(killedW.getStrength() + this.getStrength());
	}

}
