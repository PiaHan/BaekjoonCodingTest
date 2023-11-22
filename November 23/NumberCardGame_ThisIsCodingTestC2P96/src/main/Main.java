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
		 
		//열수(줄)
		int n = Integer.parseInt(st.nextToken());
		//카드 수 (가로)
		int m =  Integer.parseInt(st.nextToken());
		
		int[] arr = new int[m];
		int[] arrComp = new int[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[j] = Integer.parseInt(st2.nextToken());
			}
			Arrays.sort(arr);
			arrComp[i] = arr[0];
		}
		
		Arrays.sort(arrComp);
		int length = arrComp.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arrComp[length - i - 1];
        }
        System.out.println("Answer  : " + result[0]);

	}

}
