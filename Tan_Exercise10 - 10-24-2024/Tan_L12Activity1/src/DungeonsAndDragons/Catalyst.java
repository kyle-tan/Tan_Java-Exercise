package DungeonsAndDragons;

public class Catalyst extends DnDCharacter {

	Catalyst(String characterName) {
		super(characterName, 100, 15);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(DnDCharacter opponent) {
		// TODO Auto-generated method stub
		System.out.println(characterName + " tightly binded " + opponent.characterName);
		opponent.receiveDamage(damage);
	}

	@Override
	public void receiveDamage(int damage) {
		// TODO Auto-generated method stub
		health -= damage;
	}

}
