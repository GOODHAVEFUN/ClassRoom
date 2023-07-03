package day10;

public class Character {
	// 필드
	String name;
	int level;
	int health;

	// 생성자
	public Character(String name, int level, int health) {
		super();
		this.name = name;
		this.level = level;
		this.health = health;
	}

	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 공격합니다");
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("이름\t: " + name + " | 레벨\t : " + level + " | 체력\t : " + health);

	}
	
	//데미지를 받았다!
	public int hit(int dmg) {
		System.out.println(name+"가 데미지를 받았다");
		return dmg;
		
	}
	

}
