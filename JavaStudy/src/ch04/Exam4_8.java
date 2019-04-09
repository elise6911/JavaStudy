package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		
		// 특정 숫자를 사용해 확인 해본다
		for ( int i = 1 ; i <= 1000 ; i ++ ) {
			int n = i;
			while ( n > 0 ) {
				int n2 = n % 10;
				if( n2 == 3 ) {
					System.out.println(i + ": 3 포함");
					break;
				}
				n = n / 10;
			}
		}
		
		for (int i = 1; i <= 1000; i++) {
			// 코드 작성
			if( i < 10) {
				if ( i == 3 )
					System.out.println(i + ": 3 포함 ");
			}else if ( i < 100 ) {
				if (i - (i/10) *10 == 3 || i / 10 == 3)
					System.out.println(i + ": 3 포함 ");
			}else {
				if (i - (i / 10) *10 == 3 									// 일의 자리 3  추출
						|| ((i / 10) *10 - (i / 100) * 100 ) / 10 == 3 		// 십의 자리 3 추출
						|| i / 100 == 3)									// 백의 자리 3 추출
					System.out.println(i + ": 3 포함 ");
			}
		}
	}
}