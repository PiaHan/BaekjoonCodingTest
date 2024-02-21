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
		int square = n / 2;
		int answer = 0;
		if(n == 1) {
			answer = 1;
		}else if(n%2 != 0) {
			answer = (int) (1 + Math.pow(2, square+1));
		}else {
			answer = (int) (1 + Math.pow(2, square));
		}
		
		System.out.println("answer : " + (answer % 796796));
	}

}
