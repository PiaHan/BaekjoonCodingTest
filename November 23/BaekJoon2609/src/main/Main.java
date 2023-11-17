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
 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int gcd = 0;
		int lcm = 0;
		
		int a = 0;
		int b = 0;
		
		a = Math.max(N, M);
		b = Math.min(N, M);

		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

		/**
		 * 
		 * 나중에 이 코드 어디가 오류일까 고민해보기...
		int remain = a % b;
		
		
		if(remain == 0) {
			gcd = b;
		}else {
			while(remain != 0) {
				b = Math.max(b, remain);
				remain = Math.min(b, remain);
				gcd = remain;
				remain = b % remain;	
			}
			//gcd = Math.min(b, remain);
		}
		//lcm
		 * 
		 */
		gcd = a;
		lcm = Math.abs(N*M) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);

		
	}

}
