package Diablo;

import java.util.concurrent.ThreadLocalRandom;

public class Tomahawk extends Weapon {
	private String skill;

	Tomahawk(int durablity, String name, String rareness, int attackingPoints) {
		super(durablity, name, rareness, attackingPoints);
		this.skill = "Throw The Tomahawk";
	}

	boolean throwTheTomahawk() {
		// when hero attacks he has chance to slash because he has sword
		if (ThreadLocalRandom.current().nextInt(0, 100 + 1) <= 50) {
			System.out.println("Your hero throws his tomahawk.");
			this.attackingPoints += 200;
			return true;
		} else
			return false;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("This item's skill is " + this.skill);
	}
}
