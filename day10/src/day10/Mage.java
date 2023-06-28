package day10;

public class Mage extends Character {

    private int mana;
    private int spellPower;

    public Mage(String name, int level, int mana, int spellPower) {
        super(name, level);
        this.mana = mana;
        this.spellPower = spellPower;
    }

	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 주문을 겁니다!");
	}

}
