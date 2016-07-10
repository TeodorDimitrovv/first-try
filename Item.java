package Diablo;

public class Item {
	int durablity;
	String name;
	String rareness;
	
	Item(int durablity, String name, String rareness){
		this.durablity = durablity;
		this.name = name;
		this.rareness = rareness;
	}
	
	void showInfo(){
		System.out.println("This item's durablity " + this.durablity);
		System.out.println("This item's name " + this.name);
		System.out.println("This item's rareness " + this.rareness);
	}
	
}
