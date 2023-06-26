package day10;

public class Character {
	//필드
	String name;
	String level;
	//생성자
	public Character(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}
	
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 공격합니다");
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+ name +" , 레벨 : "+level);

	}
	
	
	

}
