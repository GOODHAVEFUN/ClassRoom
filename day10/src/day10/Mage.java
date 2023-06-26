package day10;

public class Mage extends Character {

	public Mage(String name, String level) {
		super(name, level);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 주문을 겁니다!");
	}

}
