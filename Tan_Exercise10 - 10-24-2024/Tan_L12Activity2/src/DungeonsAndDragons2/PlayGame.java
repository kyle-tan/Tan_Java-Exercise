package DungeonsAndDragons2;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DnDCharacter swordsman = new Swordsman("Diluc");
		DnDCharacter catalyst = new Catalyst("Klee");
		DnDCharacter archer = new Archer("Amber");
		
		System.out.println(swordsman.toString("Swordsman"));
		System.out.println("\n"+catalyst.toString("Catalyst"));
		System.out.println("\n"+archer.toString("Archer"));
		
		battleCharacters(archer, catalyst);
	}
	
	public static void battleCharacters(DnDCharacter char1, DnDCharacter char2) {
		System.out.println("\n"+char1.characterName + " health: " + char1.health);
		System.out.println(char2.characterName + " health: " +char2.health);
		
		while(char1.isAlive() && char2.isAlive()) {
			char1.buffAbility(20);
			char1.attack(char2);
			
			if (char2.isAlive()) {
				char2.buffAbility(10);
				char2.attack(char1);
			}
			System.out.println("\n" + char1.characterName + " health: " + char1.health);
			System.out.println(char2.characterName + " health: " + char2.health);
		}
		
		if (char1.isAlive()) {
			System.out.println("\n" + char1.characterName + " wins the game!");
		} else {
			System.out.println("\n" + char2.characterName + " wins the game!");
		}
	}

}
;