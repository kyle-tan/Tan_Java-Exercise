package DungeonsAndDragons;

public abstract class DnDCharacter {
	public String characterName;
	public int health;
	public int damage;
	
	DnDCharacter(String characterName, int health, int damage){
		this.characterName = characterName;
		this.health = health;
		this.damage = damage;
	}

	public abstract void attack(DnDCharacter opponent);
	public abstract void receiveDamage(int damage);
	
	public String toString(String characterType) {
		return String.format("%s's Profile:"
				+ "\nName: %-15s Health: %-15d Damage:%-15d", characterType,characterName, health, damage);
	}
	
	public boolean isAlive() {
		return health > 0 ? true:false;
	}
	
}
