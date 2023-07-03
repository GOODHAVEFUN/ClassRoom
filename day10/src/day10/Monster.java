package day10;

public class Monster extends Character {

	public Monster(String name, int level, int health) {
		super(name, level, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(name + "가 공격합니다");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}


	
	

}
