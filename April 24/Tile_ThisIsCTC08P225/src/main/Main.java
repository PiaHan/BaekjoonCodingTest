package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] d = new int[1001];
        
        d[1] = 1;
        d[2] = 3;
        
        int n = Integer.parseInt(st.nextToken());
        
        for(int i = 3; i <= n; i++) {
        	d[i] = (d[i-1] + d[i-2]*2)%796796;
        }
        
        System.out.println(d[n]);

	}

}
