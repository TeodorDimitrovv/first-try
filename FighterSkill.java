package Diablo;

public class FighterSkill extends Skill {
	int ragePointsCost;
	int damage;
	
	FighterSkill(String name, int cooldown, int ragePointsCost, int damage){
		super(name,cooldown);
		this.damage = damage;
		this.ragePointsCost = ragePointsCost;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("This's skill ragePoints cost: " + this.ragePointsCost);
		System.out.println("This's skill damage: " + this.damage);
	}
}
