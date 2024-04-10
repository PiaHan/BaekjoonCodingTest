package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	coins[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] dp = new int[m+1];
        
		// 입력받는 k의 값이 k<=10000이므로 초기값이 10001이 그대로면 -1을 출력해주기 위해 사용
        Arrays.fill(dp, 10001);
        dp[0] = 0; //0원은 0개의 화폐 필요

        for (int i = 0; i < n; i++) { // 화폐 갯수 만큼
            for (int j = coins[i]; j <= m; j++) { // 목표 금액까지의 dp 할당
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        System.out.println(dp[m] == 10001 ? -1 : dp[m]);
    }
        

}
