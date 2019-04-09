package ch05;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		int[] arr2 = new int[5];

		System.arraycopy(arr, 0, arr2, 0, arr.length);

		arr2[3] = 3;
		arr2[4] = 4;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}