package warriorGame;

import java.util.ArrayList;
import java.util.Random;

public class App {
	
	/*
	 * TODOS:
	 * 
	 * -continue working on the warrior list builder - convert result to an array in the end
	 * -
	 */
	
	
	
	public String getGreeting() {
		return "Hello World";
	}
	
	public void startBattle() {
		
	}
	
	// creates a list of warriors to fight by calling createWarrior multiple times
	public Warrior[] warriorListBuilder(int listLength) {
		
		// create an array of Warrior type with the provided length
		
		
		// create a list for dynamically adding warriors each iteration
		ArrayList<Warrior> warriorList = new ArrayList<Warrior>();
		
		// loop length of list calling createWarrior method
		for(int x = 0; x < listLength; x++) {
			
		}
		
		
		return null;
	}
	
	// creates a single warrior and handles rolling for stats
	public Warrior createWarrior(String heroName, int maxHealthCap, int strengthCap, int defenseCap ) {
		
		// roll for stats
		int rolledHealth = getDieRoll(maxHealthCap, 1);
		int rolledStrengthCap = getDieRoll(strengthCap, 1);
		int rolledDefenseCap = getDieRoll(defenseCap, 1);
		
		// call to create warrior
		// int maxHealth, int strength, int defense, int hitpoints, String name
		Warrior warrior = new Warrior(rolledHealth, rolledStrengthCap, rolledDefenseCap, rolledHealth, heroName);
		
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
		// TODO Auto-generated method stub
		//new App().startFight();
		//System.out.println(new App().getGreeting());
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		System.out.println(getDieRoll(6, 1));
		
	}
	
}
