package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mapRow = Integer.parseInt(st.nextToken());
        int mapCol = Integer.parseInt(st.nextToken());
        int playerRowPos = 0;
        int playerColPos = 0;
        int playerDir = 0;
        
        
        st = new StringTokenizer(br.readLine());
        playerRowPos = Integer.parseInt(st.nextToken());
        playerColPos = Integer.parseInt(st.nextToken());
        playerDir = Integer.parseInt(st.nextToken());

        int[][] map = new int[mapRow][mapCol];
        boolean[][] visit = new boolean[mapRow][mapCol];
        
        for (int i = 0; i < mapRow; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < mapCol; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        visit[playerRowPos][playerColPos] = true;

        int chk = 0;
        int answer = 1;
        int chkFourWay = 0;
        while(chk == 0) {
        	System.out.println("playerDir == " + playerDir);
        	if(playerDir == 0) {
        		if(visit[playerRowPos][playerColPos-1] == false && map[playerRowPos][playerColPos-1] == 0) {
        			visit[playerRowPos][playerColPos-1] = true;
        			answer++;
        			playerDir += 1;
        			chkFourWay = 0;
        			playerColPos -= 1;
        		}else {
        			playerDir += 1;
        			chkFourWay++;
        			if(chkFourWay == 3) {
        				chk = 1;
        			}
        		}
        	}else if(playerDir == 1) {
        		if(visit[playerRowPos+1][playerColPos] == false && map[playerRowPos+1][playerColPos] == 0) {
        			visit[playerRowPos+1][playerColPos] = true;
        			answer++;
        			playerDir += 1;
        			chkFourWay = 0;
        			playerRowPos += 1;
        		}else {
        			playerDir += 1;
        			chkFourWay++;
        			if(chkFourWay == 3) {
        				chk = 1;
        			}
        		}
        	}else if(playerDir == 2) {
        		if(visit[playerRowPos][playerColPos+1] == false && map[playerRowPos][playerColPos+1] == 0 ) {
        			visit[playerRowPos][playerColPos+1] = true;
        			answer++;
        			playerDir += 1;
        			chkFourWay = 0;
        			playerColPos += 1;
        		}else {
        			playerDir += 1;
        			chkFourWay++;
        			if(chkFourWay == 3) {
        				chk = 1;
        			}
        		}
        	}else if(playerDir == 3) {
        		if(visit[playerRowPos-1][playerColPos] == false && map[playerRowPos-1][playerColPos] == 0) {
        			visit[playerRowPos-1][playerColPos] = true;
        			answer++;
        			playerDir += 1;
        			chkFourWay = 0;
        			playerRowPos -= 1;
        		}else {
        			playerDir = 0;
        			chkFourWay++;
        			if(chkFourWay == 3) {
        				chk = 1;
        			}
        		}
        	}
        }
        
        System.out.println("answer : " + answer);
	}

}
