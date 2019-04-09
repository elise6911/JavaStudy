package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		System.out.println("∞°¿ß - 1 πŸ¿ß - 2 ∫∏ - 3");
		int player = scan.nextInt();			// ∞°¿ß
		int com  = (int) (Math.random() * 3);           // πŸ¿ß
		
		if( player == com ) {
			System.out.println("∫Ò±Ë");
		} else {
			if( (player + 1) % 3 == com )
				System.out.println("¡¸");
			else 
				System.out.println("¿Ã±Ë");
		}
		
	}	
}
