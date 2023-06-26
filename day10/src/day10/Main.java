package day10;

public class Main {
	public static void main(String[] args) {
		Character ch = new Character("이우진", "1");
		ch.display();
		ch.attack();
		
		Warrior wa = new Warrior(null, null);
		wa.display();
		wa.attack();
		
		Mage ma= new Mage(null, null);
		ma.display();
		ma.attack();

		
		
		
		
	}

}
