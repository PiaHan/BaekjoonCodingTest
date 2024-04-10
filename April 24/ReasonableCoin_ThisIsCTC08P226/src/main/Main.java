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
        
		// �Է¹޴� k�� ���� k<=10000�̹Ƿ� �ʱⰪ�� 10001�� �״�θ� -1�� ������ֱ� ���� ���
        Arrays.fill(dp, 10001);
        dp[0] = 0; //0���� 0���� ȭ�� �ʿ�

        for (int i = 0; i < n; i++) { // ȭ�� ���� ��ŭ
            for (int j = coins[i]; j <= m; j++) { // ��ǥ �ݾױ����� dp �Ҵ�
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        System.out.println(dp[m] == 10001 ? -1 : dp[m]);
    }
        

}
