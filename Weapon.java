package Diablo;

public class Weapon extends Item {
	int attackingPoints;
	
	Weapon(int durablity, String name, String rareness, int attackingPoints){
		super(durablity, name, rareness);
		this.attackingPoints = attackingPoints;
	}
	
	@Override
	void showInfo(){
		super.showInfo();
		System.out.println("This item's attackingPoints " + this.attackingPoints);
	}
}
