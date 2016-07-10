package Diablo;

public class Shield extends Item {
	int defensivePoints;
	
	Shield(int durablity, String name, String rareness, int defensivePoints){
		super(durablity, name, rareness);
		this.defensivePoints = defensivePoints;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("This item's defensive Points " + this.defensivePoints);
	}
}
