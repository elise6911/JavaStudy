package ch04;

import java.util.Scanner;

public class CountingNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 =>");
		int input = scan.nextInt();
		String str = "";
		String [] arr;
		for( int i = 1 ; i <= input ; i++ )
			str+=i;
		System.out.println(str);
		arr = str.split("");
		int count = 0;
		for( int i = 0 ; i < arr.length ; i ++ ) {
			if( arr[i].equals("8"))
				count++;
		}
		
		System.out.println("8의 개수 : " + count);
	}
}
