
public class MortalKombatDemo {

	public static void main(String[] args) {
			Fighter pesho = new Fighter("Pesho", 4);
			Fighter ivan = new Fighter("Ivan", 3);
			MortalKombat arena = new MortalKombat();
			
			arena.MortalKombatFight(pesho, ivan);
	}

}
