package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
 
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
 
		arr = new int[M];
		visit = new boolean[N];
		//System.out.println("How many times this repeat? --****");
		dfs(N, M, 0);
		System.out.println(sb);
 
	}
 
	public static void dfs(int N, int M, int depth) {
		//System.out.println("When does depth change *************************** : " + depth);
		if (depth == M) {
			
			//System.out.println("When ? : " + depth);
			for (int val : arr) {
				sb.append(val).append(' ');
			}
//			System.out.println("-------------------");
//			System.out.println("sb : " + sb);
//			System.out.println("-------------------");
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				//System.out.println("N : " + N + " / M : " + M + " / depth : " + depth + " / (i + 1) : " + (i+1));
				//System.out.println( N + " / M : " + M + " / depth : " + depth + " / (i + 1) : " + (i+1));
				//System.out.println("arr : " + Arrays.toString(arr));
				dfs(N, M, depth + 1);
				//System.out.println("Oh gosh this part works too? " );
				visit[i] = false;
			}
		}
	}
 
}
