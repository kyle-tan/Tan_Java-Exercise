package DungeonsAndDragons2;

public class Archer extends DnDCharacter{

	Archer(String characterName) {
		super(characterName, 100, 20);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(DnDCharacter opponent) {
		// TODO Auto-generated method stub
		System.out.println(characterName + " sharply shoots " + opponent.characterName);
		opponent.receiveDamage(damage);
		
	}

	@Override
	public void receiveDamage(int damage) {
		// TODO Auto-generated method stub
		health -= damage;
	}

	@Override
	public void restoreHealth(int restore) {
		// TODO Auto-generated method stub
		health += restore;
		System.out.println(characterName + " restored health: " + health);
	}

	@Override
	public void buffAbility(int buff) {
		// TODO Auto-generated method stub
		damage += buff;
		System.out.println(characterName + " buff damage: " + damage);
	}

}
