package Diablo;

public class MagicianSkill extends Skill {
	int manaPointsCost;
	
	MagicianSkill(String name, int cooldown, int manaPointsCost){
		super(name, cooldown);
		this.manaPointsCost = manaPointsCost;
	}
	
	@Override
	void showInfo() {
		
		super.showInfo();
		System.out.println("This's skill manaPoints cost: " + this.manaPointsCost);
	}
}
