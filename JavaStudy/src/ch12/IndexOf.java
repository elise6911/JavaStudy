package ch12;

class IndexOf {
	public static void main(String args[]) {
		//
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = -1;
		
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1 )
				break;
			System.out.println(idx);
		}
	}
}