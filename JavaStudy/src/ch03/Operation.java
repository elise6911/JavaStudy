package ch03;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		
		char result = in >= 0 ? '¾ç' : 'À½';
		System.out.println(result);
		
		scan.close();
	}
}
