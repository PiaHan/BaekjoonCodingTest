package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int count;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] d = new int[30001];
		d[1] = 0;
		d[2] = 1;
		d[3] = 1;
		d[4] = 2;
		d[5] = 1;
		
		for(int i = 6; i <= n; i++) {
			d[i] = d[i-1] + 1;
			
			if(i%2 == 0) {
				d[i] = Math.min(d[i/2] + 1, d[i]);
			}
			if(i%3 == 0) {
				d[i] = Math.min(d[i/3] + 1, d[i]);
			}
			if(i%5 == 0) {
				d[i] = Math.min(d[i/5] + 1, d[i]);
			}
		}
		
		System.out.println(d[n]);
	}

}
