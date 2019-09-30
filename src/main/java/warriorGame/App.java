package warriorGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
	
	/*
	 * TODOS:
	 * 
	 * -continue working on the warrior list builder - convert result to an array in the end
	 * -
	 */
	
	public void startBattle(ArrayList<Warrior> warrList, Warrior hero) {
		// create an instance of Battle
		Battle battle = new Battle(warrList, hero);
	}
	
	// takes starter values for stats and a multiplyer and creates a hero and scaling list enemies using the multiplyer
	public void battlePreparations(int enemyListLength, int strStarter, int healthStarter, int defStarter, String warriorName, int multiplyer) {
		// create hero
		Warrior myHero = createWarrior("Kaladin Frostbeard", healthStarter, strStarter, defStarter);
		
		// set up list of enemies
		ArrayList<Warrior> warrList =  warriorListBuilder(enemyListLength, strStarter, healthStarter, defStarter, warriorName, multiplyer);
		
		// begin the battle
		startBattle(warrList, myHero);
	}
	
	// creates a list of warriors to fight by calling createWarrior multiple times
	public ArrayList<Warrior> warriorListBuilder(int listLength, int strStarter, int healthStarter, int defStarter, String warriorName, int multiplyer) {
		
		// create a list for dynamically adding warriors each iteration
		ArrayList<Warrior> warriorList = new ArrayList<Warrior>();
		
		int multStrength = strStarter;
		int multHealth = healthStarter;
		int multDefense = defStarter;
		
		// loop length of list calling createWarrior method
		for(int x = 0; x < listLength; x++) {
			// call to create warrior
			
		}
		
		// return list array of warriors
		return warriorList;
	}
	
	// creates a single warrior and handles rolling for stats
	public Warrior createWarrior(String warriorName, int maxHealthCap, int strengthCap, int defenseCap ) {
		
		// roll for stats
		int rolledHealth = getDieRoll(maxHealthCap, 1);
		int rolledStrengthCap = getDieRoll(strengthCap, 1);
		int rolledDefenseCap = getDieRoll(defenseCap, 1);
		
		// call to create warrior
		// int maxHealth, int strength, int defense, int hitpoints, String name
		Warrior warrior = new Warrior(rolledHealth, rolledStrengthCap, rolledDefenseCap, rolledHealth, warriorName);
		
		// return Warrior
		return warrior;
	}
	
	// returns a random number between minimum and numberOfSides
	public static int getDieRoll(int numberOfSides, int minimum){
		
		Random rand = new Random();
		int dieRoll = rand.nextInt(numberOfSides - minimum + 1) + minimum;
		
		return dieRoll;
	}
	
	public static void main(String[] args) {
		// call for battle prep
		new App().battlePreparations(10, 3, 3, 3, "Warrior", 2);
		
	}
	
}
