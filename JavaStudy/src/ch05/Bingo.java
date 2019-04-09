package ch05;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		
		for( int i = 0 ; i < 25 ; i++ ) {
			bingo[i] = i + 1;
		}
		
		// 0 ¹ø°ú ·£´ý ÀÎµ¦½ºÀÇ ¿ä¼Ò¸¦ ¹Ù²ãÁÖ±â
		for( int i = 0 ; i < 1000 ; i++ ) {
			int temp = 0;
			int random = (int)( Math.random() * bingo.length );
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
		}
		
		for( int i = 1 ; i <= bingo.length; i ++ ) {
			System.out.print(bingo[i -1] + "\t");
			
			if( i % 5 == 0 )
				System.out.println();
		}
		
	}
}
