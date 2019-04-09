package ch05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 7, 4 };

		int min = Integer.MAX_VALUE;
//		System.out.println(min);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min || min == 0) {
				min = numbers[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		int max = Integer.MIN_VALUE;
//		System.out.println(min);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max || max == 0) {
				max = numbers[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}