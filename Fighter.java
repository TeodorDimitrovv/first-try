package Diablo;

public class Fighter extends Hero {
	int ragePoints;
	FighterSkill[] skills = new FighterSkill[3];
	int freePlacesForSkills;
	Fighter(String name, int ragePoints){
		super(name);
		this.ragePoints = ragePoints;
		this.freePlacesForSkills = 0;
		this.skills[0] = null;
		this.skills[1] = null;
		this.skills[2] = null;
	}
	
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Your hero's class: " + this.getClass().getName());
		System.out.println("Your hero's ragePoints: " + this.ragePoints);
		System.out.println("Your hero's skills:");
		for (int i = 0; i < 3; i++) {
			this.skills[i].showInfo();
		}
	}
}
