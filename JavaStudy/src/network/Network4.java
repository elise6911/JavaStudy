package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Network4 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.googleapis.com/youtube/v3/search?part=snippet&key=AIzaSyCLkoB0Bwiiem7_uVKZX9soG3IFJDqIMrw&q=원피스");
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK df90b75ec37451be4b842d54d9f7c469");
			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			while(true) {
				String data = reader.readLine();
				if(data == null) break;
				result += data;
//				System.out.println(data);
			}
			System.out.println(result);
			// JSON 문자열을 JSON 객체로 변경
			JSONObject obj = new JSONObject(result);
			JSONArray items = obj.getJSONArray("items");
			
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				JSONObject id = item.getJSONObject("id");
				
				String videoId = id.getString("videoId");
				System.out.println(videoId);
			}
//			JSONObject 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





