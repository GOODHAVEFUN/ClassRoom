package day10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Character character = new Character("무직", 1, 10);
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (true) {
			System.out.println("1.게임시작");
			System.out.println("2.게임종료");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("직업을 고르세요");
				System.out.println("1. 전사");
				System.out.println("2. 마법사");
				System.out.println("3. 뒤로 돌아갑니다");
				System.out.print("선택 : ");
				int characterChoice = sc.nextInt();
				System.out.println();
				if (characterChoice == 1) {
					character = new Warrior("전사", 1, 10, 1);
					System.out.println(character.name + "를 선택했습니다");
				} else if (characterChoice == 2) {
					character = new Mage("마법사", 1, 10, 10, 1);
					System.out.println(character.name + "를 선택했습니다");
				} else if (characterChoice == 3) {
					System.out.println("뒤로 돌아갑니다");
					choice = 1;
				} else {
					System.out.println("잘못된 선택입니다.");
				}
				break;

			case 2:
				System.out.println("게임을 종료합니다");
				return;

			default:
				System.out.println("잘못된 선택\n");
				continue;

			}

			// 직업을 가져와 저장
			character.display();
			// 이제 게임이 시작된다 몬스터를 만난다 싸운다 라운드가 지날때마다 몬스터를 공격하고 공격받는다
			System.out.println("게임시작");
			Monster monster = new Monster("몬스터", 1, 10);// 몬스터 생성
			character.display();
			monster.display();

			int round = 1;
			while (true) {

				System.out.println(round + "라운드");
				// 캐릭터 공격
				character.attack();
				monster.hit(1);
				monster.health--;
				character.display();
				monster.display();

				if (character.health == 0) {
					System.out.println("게임오버");
					break;
				} else if (monster.health == 0) {
					System.out.println("게임클리어");
					// 체력 감소디스플레이를 띄운다 몬스터가 죽으면 다음 라운드로 넘어간다 캐릭터가 죽으면 게임오버가 뜨면서 게임이 종료된다
					break;
				}

				// 몬스터 공격
				monster.attack();
				character.hit(1);
				character.health--;
				character.display();
				monster.display();
				if (character.health == 0) {
					System.out.println("게임오버");
					break;
				} else if (monster.health == 0) {
					System.out.println("게임클리어");
					// 체력 감소디스플레이를 띄운다 몬스터가 죽으면 다음 라운드로 넘어간다 캐릭터가 죽으면 게임오버가 뜨면서 게임이 종료된다
					break;
				}
				++round;

			}

		}

	}

}
