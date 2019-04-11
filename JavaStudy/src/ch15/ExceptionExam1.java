package ch15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String numStr = " 123";
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(numStr);
		boolean isNumber = m.matches();
		if (isNumber) {
			int num = Integer.parseInt(numStr);
		}

		Object obj = new String("a");
		if (obj instanceof Integer) {
			int a = (Integer) obj;
		} else if (obj instanceof String) {
			String a = (String) obj;
		}
	}
}