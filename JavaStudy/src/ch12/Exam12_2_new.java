package ch12;

public class Exam12_2_new {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		
		/* A ~ Z, a ~ z ������ �����̸� �ƽ�Ű �ڵ带 2 ������Ų �� ��� */
		/* ��, X / x / Z / z �� ��� 2 ���� �� */
		/* ���ĺ� ������ ����� �ʵ��� ó�� */
		/* A ~ Z, a ~ z ������ ���ڰ� �ƴϸ� �״�� ��� */
		
		for( int i = 0 ; i < msg.length() ; i ++ ) {
			char c = msg.charAt(i);
			
			if( (c >= ASCII_A && c < ASCII_Z-1) || ( c >= ASCII_a && c < ASCII_z-1 ))
				System.out.print((char)(c+2));
			else if ( (c >= ASCII_Z-1 && c < ASCII_Z+1)|| ( c >= ASCII_z-1 && c < ASCII_z+1 ))
				System.out.print((char)(c-24));
			else
				System.out.print(c);
			
		}
		
	}
}