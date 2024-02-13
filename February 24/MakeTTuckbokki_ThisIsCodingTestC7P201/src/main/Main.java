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
    
        int[] ttukList = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	ttukList[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(ttukList);
        int maxLength = ttukList[n-1] -1;
        
        for(int i = maxLength; i>0; i--) {
        	int sum = 0;
        	for(int j = 0; j < n; j++) {
        		if(ttukList[j] - i < 0) {
        			
        		}else {
        			sum += (ttukList[j] - i);
        		}
        		if(sum >= m) {
        			System.out.println(i);
        			return;
        		}
        	}
        }
        
	}
}
