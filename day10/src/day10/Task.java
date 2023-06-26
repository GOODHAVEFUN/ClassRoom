package day10;

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
//2. 어댑터 클래스 연습문제
//
//Player 인터페이스
//	play(), pause(), stop() 메소드 정의
//
//PlayerAdapter 클래스
//	MediaPlayer 인터페이스 구현
//	각 메소드를 호출할 때마다 "Adapter: 재생", "Adapter: 일시중지", "Adapter: 중지" 출력
//
//Client 클래스
//	MediaPlayer를 받는 생성자
//	playMedia(), pauseMedia(), stopMedia() 메소드호출
//	Player 인터페이스 메소드 실행
//
//Main 클래스
//	PlayerAdapter 인스턴스 생성
//	PlayerAdapter 인스턴스 생성한 것을 Client 클래스의 생성자에 전달
//	클라이언트 Player의 메소드 사용
//
//3. 인터페이스 연습 문제
//Transportation 인터페이스
//	메소드
//		start() -> 운송 수단의 출발 동작을 정의
//		stop() -> 운송 수단의 정지 동작을 정의
//
//Car 클래스
//	Transportation 인터페이스를 구현
//	필드
//		 브랜드(brand)
//	생성자
//		브랜드를 매개변수로 받아 초기화
//	메소드
//		start() -> "차가 시동을 걸고 출발합니다." 출력
//		stop() -> "차가 멈춥니다." 출력
//
//Bicycle 클래스
//	Transportation 인터페이스를 구현
//	필드
//		색상(color)
//	생성자
//		색상을 매개변수로 받아 초기화
//	메소드
//		start() "자전거가 출발합니다." 출력
//		stop()	"자전거가 정지합니다." 출력
//
//Main 클래스
//	Car와 Bicycle 클래스의 인스턴스 생성
//	start() 메소드 호출
//	stop() 메소드 호출

public class Task {

}
