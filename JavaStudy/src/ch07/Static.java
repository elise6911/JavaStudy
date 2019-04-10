package ch07;

public class Static {
	static char color = 'R';
	static int num = 0;
	int score = 0;
	
	static void staticMethod() {				/// 실행 될 준비 되어 있는 메소드
		Static s = new Static();
		s.score = s.score + 1;
		System.out.println("static method");
		num++;
	}

	void instanceMethod() {						/// 실행되어야 실행시킬 수 있는 메소드
		num = num + 1;
		score = score + 1;
		System.out.println("instance method");
	}
}