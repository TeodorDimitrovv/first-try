package Diablo;

import java.util.concurrent.ThreadLocalRandom;

public class Sword extends Weapon {
	private String skill;
			
	
	Sword(int durablity, String name, String rareness, int attackingPoints){
		super(durablity, name, rareness,attackingPoints);
		this.skill = "Slash";
	}
	
	boolean slash(){
		//when hero attacks he has chance to slash because he has sword
		if(ThreadLocalRandom.current().nextInt(0, 100 + 1) <= 50){
			System.out.println("Your hero slashes through creeps with his sword.");
			this.attackingPoints += 150;
			return true;
		}
		else
			return false;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("This item's skill is " + this.skill);
	}
}
