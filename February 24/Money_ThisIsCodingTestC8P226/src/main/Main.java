package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] moneyList = new int[n];
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	moneyList[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(moneyList);
        int answer = 0;
        int[] d = new int[10001];
     
        Arrays.fill(d, 10001);

        d[0] = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = moneyList[i]; j <= m; j++) {
        		//if(j - moneyList[i] >= 1) {
        			d[j] = Math.min(d[j], d[j - moneyList[i]] + 1);
        		//}
        		
        	}
        }
        
        System.out.println(d[m] == 10001 ? -1 : d[m]);


	}

}
