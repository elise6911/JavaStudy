package ch06;

public class Method1 {
	public static char sum(int a, char c) {
//		System.out.println(2);
		char trans = (char) (c + a);
//		System.out.println(trans);
		
		return trans;
	}
	
	public static void main(String[] args) {
//		System.out.println(1);
		System.out.println((long) Math.pow(2, 38));			// 2�� 38���� ���� ���Ѵ�.
		char ch = sum(2, 'A');
		System.out.println(ch);
//		System.out.println(3);
		
	}
}
