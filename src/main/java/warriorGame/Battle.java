package warriorGame;

import java.util.Random;

// representation of a series of duels until hero wins all duels or dies
public class Battle{
	
	Warrior[] warriorList;
	Warrior hero;
	
	// constructor
	public Battle(Warrior[] warrList, Warrior hero ) {
		this.warriorList = warrList;
		this.hero = hero;
		
		// call battleManager
	}
	
	public Battle() {
		
	}

	// representation of a fight to the death between hero and warrior from warrList
	public Warrior duel(Warrior warr1, Warrior warr2) {
		
		Warrior attacker;
		Warrior defender;
		Warrior interimObj;
		
		// roll for who goes first
		// set inital attacker and defender variables
		if(App.getDieRoll(2, 1) == 1) {
			attacker = warr1;
			defender = warr2;
		} 
		else {
			attacker = warr2;
			defender = warr1;
		}
		
		
		
		
		// loop attacking until one is dead
		
		// attacker rolls die with (strength) # of sides 
		
		// defender rolls die with (defense) # of sides
		
		// if (attackRoll - defenseRoll) > 0 then set defender.hitpoints = (defender.hitpoints - (attackRoll - defenseRoll))
		
		// if defender is dead return attacker
		
		// else alternate attacker and defender objects
		
		return null;
	}
	
	// represents a manager that loops through the list of warriors and sends them each into a duel with the hero
	public Warrior battleManager(Warrior[] warriorlist) {
		
		// loop through warriorList calling duel() until our hero wins or dies
		
		
		return null;
	}
	
	
	
	
}
