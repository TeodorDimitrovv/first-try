
public class MortalKombat {
	private static int round = 1;
	void MortalKombatFight(Fighter lightSide, Fighter darkSide){
		
		
		if(lightSide.getLife() <= 0){
			System.out.println(darkSide.getName() + " killed " + lightSide.getName());
			System.out.println(darkSide.getName() + " wins.");
			System.out.println(darkSide.getName() + " won with " + darkSide.getLife() + " lifepoints remaining.");
			return;
		}
		
		if(darkSide.getLife() <= 0){
			System.out.println(lightSide.getName() + " killed " + darkSide.getName());
			System.out.println(lightSide.getName() + " wins.");
			System.out.println(lightSide.getName() + " has " + lightSide.getLife() + " lifepoints remaining.");
			return;
		}
		
		System.out.println();
		System.out.println("Round " + MortalKombat.round);
		MortalKombat.round++;
		
		lightSide.hits(darkSide);
		MortalKombatFight(darkSide, lightSide);
		
	}
	
}
