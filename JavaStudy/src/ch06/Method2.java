package ch06;

public class Method2 {
	public static char sum(int a, char c) {
//		System.out.println(2);
		char trans = (char) (c + a);
//		System.out.println(trans);
		
		return trans;
	}
	
	public static void main(String[] args) {
//		System.out.println(1);
		System.out.println((long) Math.pow(2, 38));			// 2의 38승의 값을 구한다.
		char ch = sum(2, 'A');
		System.out.println(ch);
//		System.out.println(3);
		
		String str ="g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		String[] arr;
		
		arr = str.split("");
		for(int i = 0 ; i < arr.length ; i ++ )
			System.out.print(arr[i]);
		System.out.println();
		System.out.println("==================================");
		for(int i = 0 ; i < arr.length ; i ++ )
			if( !arr[i].equals(" ") ||  !arr[i].equals(".") )
				arr[i] = sum(2,  arr[i].charAt(0)) + "";
		
		str = "";
		for(int i = 0 ; i < arr.length ; i ++ )
			str+=arr[i];
		System.out.println(str);
		
		
	}
}
