package day10;

import java.util.Scanner;
//1. 상속 연습 문제
//
//Character 클래스
//	필드
//		이름(name), 레벨(level)
//	생성자
//		이름과 초기 레벨을 매개변수로 받아 초기화
//	메서드
//		attack() -> "캐릭터가 공격합니다!"라는 메시지 출력
//		display() -> "이름: [이름], 레벨: [레벨]" 캐릭터 정보 출력
//
//Warrior 클래스
//	Character 클래스 상속
//	필드
//		체력(health), 공격력(attackPower)
//	메소드
//		attack() -> "전사가 검으로 공격합니다!" 출력
//
//Mage 클래스
//	Character 클래스 상속
//	필드
//		마나(mana), 주문력(spellPower)
//	메소드
//		attack() -> "마법사가 주문을 겁니다!" 출력
//
//Main 클래스
//	Warrior와 Mage 클래스의 인스턴스 생성
//	각 인스턴스의 이름, 레벨, 체력, 공격력, 마나, 주문력 설정
//	attack() 메서드 호출 -> 각 캐릭터의 공격 동작 출력
//	display() 메서드 호출 -> 각 캐릭터의 정보 출력
//

public class Main {
	public static void main(String[] args) {
		Character character = new Character("무직", 1);				
		Scanner sc = new Scanner(System.in);
		int choice = 0;


		System.out.println("1.게임시작");
		System.out.println("2.게임종료");
		System.out.print("선택 : ");
		choice = sc.nextInt();
		System.out.println();

		switch (choice) {
		case 1:
			System.out.println("직업을 고르세요");
			System.out.println("1. 워리어");
			System.out.println("2. 메이지");
			System.out.println("3. 뒤로 돌아갑니다");
			System.out.print("선택 : ");
			int characterChoice = sc.nextInt();
			System.out.println();
			if (characterChoice == 1) {
				character = new Warrior("전사", 1, 10, 10);
				System.out.println(character.name + "를 선택했습니다");
			} else if (characterChoice == 2) {
				character= new Mage("마법사", 1, 10, 10);
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
			System.out.println("잘못된선택");
			break;
		}

		// 직업을 가져와 저장
		character.display();
		character.attack();
		
	}

}
