package day10;

public class Warrior extends Character {

	private int attackPower;

	public Warrior(String name, int level, int health, int attackPower) {
		super(name, level, health);
		this.attackPower = attackPower;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("전사가 검으로 공격합니다!");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("이름\t : " + name + " | 레벨\t : " + level + " | 체력\t : " + health + " | 힘\t : " + attackPower);
	}

}
