package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[][] iceCream;
	public static boolean[][] visit;
	public static int n;
	public static int m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int answer = 0;
        iceCream = new int[n][m];
        visit = new boolean[n][m];
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		iceCream[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		if(dfs(i, j) == true) {
        			answer += 1;
        		}
        		
        	}
        }
        
        System.out.println("answer : " + answer);
	}
	
	public static boolean dfs(int x, int y) {
		
		if(x <= -1 || x >= n || y <= -1 || y>= m) {
			return false;
		}
		
		if(visit[x][y] == false && iceCream[x][y] == 0) {
			visit[x][y] = true;
			dfs(x, y-1);
			dfs(x, y+1);
			dfs(x-1, y);
			dfs(x+1, y);
			return true;
		}
		
		return false;
	}

}
