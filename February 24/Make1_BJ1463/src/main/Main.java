package main;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];  //DP �迭 �ʱ�ȭ
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            if (i % 6 == 0) {
                //6���� �������� 3���� �������� ���, 2�� �������� ��� �Ѵ� Ȯ��
                dp[i] = Math.min(dp[i/3], Math.min(dp[i/2], dp[i-1])) + 1;
            } else if (i % 3 == 0) {
                //3���� �������� ���
                dp[i] = Math.min(dp[i/3], dp[i-1])+1;
            } else if (i % 2 == 0) {
                //2�� �������� ���
                dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
            } else {
                //�������� �ʴ� ���
                dp[i] = dp[i-1] + 1;
            }
        }
        System.out.print(dp[n]);
//        System.out.println("--------------");
//        for(int i = 1; i <= 10; i++) {
//        	System.out.println("test : " + dp[i]);
//        }
    }
}
