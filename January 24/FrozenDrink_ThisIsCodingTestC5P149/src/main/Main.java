package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] cube;
	public static boolean[][] visit;
	public static int row;
	public static int width;
	

	//public static 
	public static boolean dfs(int nodeRow, int nodeHeight) {
		if (nodeRow < 0 || nodeRow >= row || nodeHeight < 0 || nodeHeight >= width) {
			return false;
		}
		
		if(visit[nodeRow][nodeHeight] == false && cube[nodeRow][nodeHeight]==0) {
			
			visit[nodeRow][nodeHeight] = true;
			
			dfs(nodeRow + 1, nodeHeight);
			dfs(nodeRow - 1, nodeHeight);
			dfs(nodeRow, nodeHeight + 1);
			dfs(nodeRow, nodeHeight - 1);
			
			return true;
		}

		return false;
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        row = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        
        cube = new int[row][width];
        visit = new boolean[row][width];
        
        for (int i = 0; i < row; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width; j++)
            {
            	cube[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int answer = 0;
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < width; j++) {
        		if(cube[i][j]==0) {
        			if(dfs(i,j)) {
        				answer++;
        			}
        		}
        	}
        }
        System.out.println("answer : " + answer);
	}
	
}
