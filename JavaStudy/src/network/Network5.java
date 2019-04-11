package network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network5 {
	public static void main(String[] args) {
//		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
//		String result = vu.sendFile("C:/dev/a.jpg");
//		System.out.println(result);
//		String r = vu.sendUrl("");
//		System.out.println(r);
		
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "jp", "안녕하세요 저는 한국의 개발자 입니다. ");
		System.out.println(r);
	}
}
