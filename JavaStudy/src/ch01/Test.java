package ch01;

public class Test {
	public static void main(String[] args) {
		// Unix Time
		System.out.println(System.currentTimeMillis());
		
		//Random 0.0 <= X < 1.0
		System.out.println(Math.random());

		// 1 ~ 6 사이의 수가 나오게 하려면?
		System.out.println( Math.random() * 6);
		System.out.println( (int)(Math.random() * 6) + 1); 			// 형 변환(casting) , 오버플로우
		
	}
}
