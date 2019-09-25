package warriorGame;

public interface WarriorInterface {
	int maxHealth = 1;
	int strength = 1;
	int defense = 1;
	int hitpoints = 1;
	String name = "Warrior";
	
	public String getName();

	public void setName(String name);

	public void setMaxHealth(int maxHealth);
	
	public int getMaxHealth();

	public void setHealth(int maxHealth);

	
	public int getStrength();

	public void setStrength(int strength);

	public int getDefense();

	public void setDefense(int defense);
	
	public int getHitpoints();
	
	public void setHitpoints(int hitpoints);
	
	public void rest();
	
	public void promote(Warrior killedW);
}
