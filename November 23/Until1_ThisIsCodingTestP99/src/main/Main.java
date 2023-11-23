package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		while(n != 1) {
			int remain = n % k;
			if(remain != 0) {
				count += remain;
				n = n - remain;
				System.out.println("count 1");
			}else {
				n = n / k;
				count++;
				System.out.println("count 2");
			}	
		}
		
		System.out.println("answer : " + count);
		
	}

}
