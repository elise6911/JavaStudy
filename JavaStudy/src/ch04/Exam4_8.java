package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		
		// Ư�� ���ڸ� ����� Ȯ�� �غ���
		for ( int i = 1 ; i <= 1000 ; i ++ ) {
			int n = i;
			while ( n > 0 ) {
				int n2 = n % 10;
				if( n2 == 3 ) {
					System.out.println(i + ": 3 ����");
					break;
				}
				n = n / 10;
			}
		}
		
		for (int i = 1; i <= 1000; i++) {
			// �ڵ� �ۼ�
			if( i < 10) {
				if ( i == 3 )
					System.out.println(i + ": 3 ���� ");
			}else if ( i < 100 ) {
				if (i - (i/10) *10 == 3 || i / 10 == 3)
					System.out.println(i + ": 3 ���� ");
			}else {
				if (i - (i / 10) *10 == 3 									// ���� �ڸ� 3  ����
						|| ((i / 10) *10 - (i / 100) * 100 ) / 10 == 3 		// ���� �ڸ� 3 ����
						|| i / 100 == 3)									// ���� �ڸ� 3 ����
					System.out.println(i + ": 3 ���� ");
			}
		}
	}
}