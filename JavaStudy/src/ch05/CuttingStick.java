package ch05;

import java.util.Scanner;

public class CuttingStick {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�迭�� ���̸� �Է��ϼ���. :");
			int arr_len = scan.nextInt();
			
			System.out.print("������� ���̸� �Է��ϼ���  :");
			int[] stick = new int[arr_len];
			
			for (int i = 0; i < arr_len; i++)
				stick[i] = scan.nextInt();

			boolean isCheck = true;
			
			while (isCheck) {
				int count = 0;

				int min = Integer.MAX_VALUE;
				for (int i = 0; i < stick.length; i++) {
					if (stick[i] <= 0)
						continue;

					if (stick[i] < min || min == 0) {
						min = stick[i];
					}
				}
//				System.out.println("�迭 �� �ּҰ� : " + min);
				for (int i = 0; i < stick.length; i++) {
					stick[i] -= min;
			
					if (stick[i] >= 0)
						count++;
					else
						stick[i] = -1;
				}
				

				System.out.println(count);

				if (count == 1)
					isCheck = false;
			}

			scan.close();
		}
	}
}
