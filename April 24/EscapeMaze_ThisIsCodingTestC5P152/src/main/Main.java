package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static class point{
        public int x;
        public int y;

        point(int x, int y){
            this.x = x;
            this.y = y;
        }

        point(point p){
            this.x = p.x;
            this.y = p.y;
        }
    }
	
	public static Queue<point> q = new LinkedList<>(); 
	public static int[][] map;
	
	public static void main(String[] args) throws IOException {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int height = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        
        map = new int[height][row];
        
        for(int i = 0; i < height; i++) {
        	 st = new StringTokenizer(br.readLine());
        	 for(int j = 0; j < row; j++) {
        		 map[i][j] =  Integer.parseInt(st.nextToken());
        	 }
        }
        
        point start = new point(0, 0);
        
        q.add(start);
        
        while(!q.isEmpty()) {
        	point v = new point(q.poll());
        	
        	for(int i=0;i<4;i++){
                int nx = v.x+dx[i];
                int ny = v.y+dy[i];
               
                if(nx <0 || nx > height-1 || ny <0 || ny > row-1){
                    
                }else if(map[nx][ny]==0){

                }else if(map[nx][ny]==1){
                	map[nx][ny] = map[v.x][v.y]+1;  //거리 계산
                    q.add(new point(nx, ny));   //큐에 현재 좌표 넣기
                }
        	}
        }
        
       System.out.println(map[height-1][row-1]);

        
	}

}
