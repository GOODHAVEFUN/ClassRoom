package day10;

public class Warrior extends Character {

    private int health;
    private int attackPower;
    
    public Warrior(String name, int level, int health, int attackPower) {
        super(name, level);
        this.health = health;
        this.attackPower= attackPower;
    }
    
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("전사가 검으로 공격합니다!");
	}
	
	

}
