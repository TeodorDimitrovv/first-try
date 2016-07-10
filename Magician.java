package Diablo;

public class Magician extends Hero {
	int manaPoints;
	MagicianSkill[] skills = new MagicianSkill[3];
	
	Magician(String name, int manaPoints){
		super(name);
		this.manaPoints = manaPoints;
		this.skills[0] = null;
		this.skills[1] = null;
		this.skills[2] = null;
	}
	
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Your hero's class: " + this.getClass().getName());
		System.out.println("Your hero's manaPoints: " + this.manaPoints);
		System.out.println("Your hero's skills:");
		for (int i = 0; i < 3; i++) {
			this.skills[i].showInfo();
		}
	}
}
