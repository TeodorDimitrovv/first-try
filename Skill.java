package Diablo;

public class Skill {
	String name;
	int cooldown;
	
	Skill(String name, int cooldown){
		this.name = name;
		this.cooldown = cooldown;
	}
	
	void showInfo(){
		System.out.println("This's skill name: " + this.name);
		System.out.println("this's skill cooldown: " + this.cooldown);
	}
	
}
