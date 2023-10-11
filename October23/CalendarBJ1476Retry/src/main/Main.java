package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] input =br.readLine().split(" ");
		int e = Integer.parseInt(input[0]);
		int s = Integer.parseInt(input[1]);
		int m = Integer.parseInt(input[2]);
		
		int year = 1;
		int chkYear = 0;
		int E = 1;
		int S = 1;
		int M = 1;
		
		while(chkYear == 0) {
			year++;
			E++;
			S++;
			M++;
			if(E == 16) {
				E = 1;
			}
			if(S == 29) {
				S = 1;
			}
			if(M == 20) {
				M = 1;
			}
			
			if(E == e && S == s && M == m) {
				System.out.println(year);
				return;
			}
		}
		
		
	}

}
