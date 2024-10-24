package DungeonsAndDragons2;

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
