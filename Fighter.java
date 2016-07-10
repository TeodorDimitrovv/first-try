
import java.util.concurrent.ThreadLocalRandom;

public class Fighter {
	private String name;
	private int life;
	private double damagePerHit;
	
	Fighter(String name, int damagePerHit){
		this.name = name;
		this.life = 100;
		this.damagePerHit = damagePerHit;
	}
	
	void hits(Fighter enemy){
		System.out.println(this.name + " Attacks " + enemy.name);
		if(!enemy.dodge()){
			if(!enemy.block()){
				if(enemy.life <= this.damagePerHit){
				enemy.life = 0;
				System.out.println(enemy.name + " is Dead.");
				}
				else{
					enemy.life -= this.damagePerHit;
					System.out.println(enemy.name + " now has " + enemy.life + " lifepoints left.");
				} 
			}
			else {
				System.out.print(enemy.name + " has blocked " + this.name + "'s hit.");
				enemy.life -= this.damagePerHit*6/10;
				System.out.println(enemy.name + " now has " + enemy.life + " lifepoints left.");
			}
			
		}
		else {
			System.out.print(enemy.name + " has dodged " + this.name + "'s hit.");
			System.out.println(enemy.name + " still has " + enemy.life + " lifepoints left.");
		}
	}
	
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	private boolean block(){
		if(ThreadLocalRandom.current().nextInt(0, 100 + 1) <= 35){
			return true;
		}
		else return false;
	}
	
	private boolean dodge(){
		if(ThreadLocalRandom.current().nextInt(0, 100 + 1) <= 10){
			return true;
		}
		else return false;
	}
}
