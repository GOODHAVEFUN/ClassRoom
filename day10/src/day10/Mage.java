package day10;

public class Mage extends Character {

	private int mana;
	private int spellPower;

	public Mage(String name, int level, int health, int mana, int spellPower) {
		super(name, level, health);
		this.mana = mana;
		this.spellPower = spellPower;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 주문을 겁니다!");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("이름\t : " + name + " | 레벨\t : " + level + " | 체력\t : " + health +" | 마나\t : " + mana + " | 마법\t : " + spellPower);

	}

}
