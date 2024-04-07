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

        int n = Integer.parseInt(st.nextToken());
        int[] K = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	K[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] f = new int[n+1];
        f[0] = K[0];
        f[1] = Math.max(K[0], K[1]);
        for(int i = 2; i < n; i++) {
        	System.out.println((f[i-2] + f[i]) + " " + f[i-1]);
        	f[i] = Math.max(f[i-2] + K[i], f[i-1]);
        }
        System.out.println(f[n-1]);
	}

}
