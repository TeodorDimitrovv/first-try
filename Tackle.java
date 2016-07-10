package Diablo;

public class Tackle extends FighterSkill{
	
	
	Tackle(String name, int cooldown, int ragePointsCost, int damage){
		super(name,cooldown, ragePointsCost,damage);
	
	}
	
	//void tackle(){};
	
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("This's skill damage: " + this.damage);
	}
}
