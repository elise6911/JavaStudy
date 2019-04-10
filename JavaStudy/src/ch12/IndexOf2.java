package ch12;
// 시작 인덱스와 끝 인덱스를 변수로 나누어 공백의 위치를 추적한다. 나중에  substring 에 사용할 수 있다
class IndexOf2 {
	public static void main(String args[]) {
		//
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int sidx = 0;
		int eidx = 0;
		while(true) {
			eidx = str.indexOf(" ", sidx + 1);
			if(eidx == -1 )
				break;
			System.out.println(sidx + ", " + eidx);
			sidx = eidx;
		}
	}
}