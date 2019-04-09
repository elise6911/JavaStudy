package ch05;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] { 
			{ 1, 2 }, 
			{ 4, 5, 6 }, 
			{ 7, 8, 9, 19 }, 
			{ 10, 11, 12 } 
			};

//		fSystem.out.println(arr1[2][2]);
		int total = 0 ;
		int len = arr1.length;							// arr1의 길이
		int len2 = arr1[2].length;						// arr1의 3행의 길이
		System.out.println(len2);
		for( int i = 0 ; i < arr1.length ; i ++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ ) {
				System.out.println(arr1[i][j]);
				total+=arr1[i][j];
			}
		}
		
		System.out.println(total);
	}
}