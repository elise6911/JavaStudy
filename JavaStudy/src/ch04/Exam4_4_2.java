package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		// �ڵ� �ۼ�
		int sum = 0;
		
		for ( int i = 0 ; i <= 1000 ; i ++ ) {
			if( i % 2 == 0 && i % 7 == 0 ) {
				sum += i;
				System.out.println(i);
			}
			
		}
		
		System.out.println("�� ���ڵ��� ��: " + sum);
	}
}
