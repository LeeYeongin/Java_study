package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_10813 {
	public static void setBall(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; // 0부터가 아닌 1부터 이므로 +1을 해줌
		}
	}
	
	public static void changeBall(int[] arr, int i, int j) {
		int tmp=0;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		setBall(arr); // 각 바구니에 해당하는 번호의 공 넣기
		
		for(int k=0; k<M; k++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(s.nextToken());
			int j = Integer.parseInt(s.nextToken());
			
			changeBall(arr, i-1, j-1); // 배열의 index는 0부터 시작하기 때문에 -1을 해줌
		}
		
		print(arr);
	}
}
