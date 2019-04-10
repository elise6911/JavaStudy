package ch05;

public class CuttingStick_s {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };

		while (true) {
			// 1. 0보다 큰 배열 요소의 개수를 출력한다.
			int count = 0;

			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0)
					count++;
			}
			
			System.out.println(count);
			if( count <= 1 )
				break;
			
			// 2. 배열 요소 중에서 0을 제외하고 가장 작은 수를 찾아낸다.
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < stick.length; i++) {
				if (stick[i] < min && stick[i] > 0)
					min = stick[i];
			}
//		System.out.println(min);
//		for( int value : stick) {
//			System.out.println(value);
//		}
			// 3. 가장 작은 수로 모든 배열의 요소 값을 감소시킨다.
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
			//
		}
	}
}
