package day10;

public class Warrior extends Character {

	public Warrior(String name, String level) {
		super(name, level);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("전사가 검으로 공격합니다!");
	}

}
