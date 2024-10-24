package DungeonsAndDragons;

public class Swordsman extends DnDCharacter{

	Swordsman(String characterName) {
		super(characterName, 100, 25);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(DnDCharacter opponent) {
		// TODO Auto-generated method stub
		System.out.println(characterName + " slashes " + opponent.characterName);
		opponent.receiveDamage(damage);
		
	}

	@Override
	public void receiveDamage(int damage) {
		// TODO Auto-generated method stub
		health -= damage;
	}

}
