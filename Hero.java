package Diablo;

public class Hero {
	Item[] items = new Item[7];
	String name;
	String weapon;
	String shield;
	String helm;
	String armor;
	String pants;
	String gloves;
	String boots;
	int level = 1;

	Hero(String name) {
		this.setName(name);
		this.weapon = null;
		this.shield = null;
		this.helm = null;
		this.armor = null;
		this.pants = null;
		this.gloves = null;
		this.boots = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		if(weapon.contains("Weapon")){
			this.weapon = weapon;
		}
	}

	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		if (shield.contains("Shield")) {
			this.shield = shield;
		}
	}

	public String getHelm() {
		return helm;
	}

	public void setHelm(String helm) {
		if (helm.contains("Helm")) {
			this.helm = helm;
		}
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		if (armor.contains("Armor")) {
			this.armor = armor;
		}
	}

	public String getPants() {
		return pants;
	}

	public void setPants(String pants) {
		if (pants.contains("Pants")) {
			this.pants = pants;
		}
	}

	public String getGloves() {
		return gloves;
	}

	public void setGloves(String gloves) {
		if (gloves.contains("Gloves")) {
			this.gloves = gloves;
		}
	}

	public String getBoots() {
		return boots;
	}

	public void setBoots(String boots) {
		if (boots.contains("Boots")) {
			this.boots = boots;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	void showInfo() {
		System.out.println("Your hero's name: " + this.name);
		System.out.println("Your hero's weapon: " + this.weapon);
		System.out.println("Your hero's shield: " + this.shield);
		System.out.println("Your hero's helm: " + this.helm);
		System.out.println("Your hero's armor: " + this.armor);
		System.out.println("Your hero's pants: " + this.pants);
		System.out.println("Your hero's gloves: " + this.gloves);
		System.out.println("Your hero's boots: " + this.boots);
		System.out.println("Your hero's level: " + this.level);
	}
}
