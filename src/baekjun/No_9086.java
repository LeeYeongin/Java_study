package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No_9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		List<String> results = new ArrayList<String>();
		char[] tmp;
		for(int i=0; i<n; i++) {
			s = br.readLine();
			String result = String.join("", String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
			results.add(result);
		}
		
		for(int i=0; i<results.size(); i++) {
			System.out.println(results.get(i));
		}
	}
}
