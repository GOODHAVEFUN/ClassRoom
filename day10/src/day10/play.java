package day10;

public class play extends Character{

	String attker;
	String hitting;
	
	public void play(String attker,String hitting) {
		attker.attack();
		hitting.hit(1);
		hitting.health--;
		attker.display();
		hitting.display();
		
		if (attker.health == 0) {
			System.out.println("게임오버");
			break;
		} else if (hitting.health == 0) {
			System.out.println("게임클리어");
			// 체력 감소디스플레이를 띄운다 몬스터가 죽으면 다음 라운드로 넘어간다 캐릭터가 죽으면 게임오버가 뜨면서 게임이 종료된다
			break;
		}
	}
	
	

}
