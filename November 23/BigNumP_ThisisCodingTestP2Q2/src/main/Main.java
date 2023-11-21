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
		int k = Integer.parseInt(st.nextToken());
		
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0; i < n; i++) {
			arr[i] =  Integer.parseInt(st2.nextToken());
			//System.out.println("arr : " + arr[i]);
		}
	
		Arrays.sort(arr);
		int length = arr.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr[length - i - 1];
            //System.out.println("sort : " + result[i]);
        }
        
        int answer = 0;
        System.out.println("ttt : " + m/k);
        int j = 0;
        for(int i = 0; i < m; i++){
        	if(j < k) {
            	answer += result[0]*j;
            	j++;
        	}else {
        		j = 0;
        		answer += result[1]; 
        	}
        }
        
        System.out.println("answer : " + answer);
        
        
        
        
        

	}

}
