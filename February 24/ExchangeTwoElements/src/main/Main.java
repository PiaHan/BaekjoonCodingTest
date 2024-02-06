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
	    
	    int elementNum = Integer.parseInt(st.nextToken());
	    int changeNum = Integer.parseInt(st.nextToken());
	    
	    int[] firstArray = new int[elementNum];
	    int[] secondArray = new int[elementNum];
	    
	    for(int i = 0; i < 2; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j = 0; j < elementNum; j++) {
	    		if(i == 0) {
	    			firstArray[j] = Integer.parseInt(st.nextToken());
	    		}else if(i == 1) {
	    			secondArray[j] = Integer.parseInt(st.nextToken());
	    		}
	    	}
	    }
	    
	    Arrays.sort(firstArray);
	    Arrays.sort(secondArray);
	    
	    System.out.println("111 : " + Arrays.toString(firstArray));
	    System.out.println("222 : " + Arrays.toString(secondArray));
	    int a = 1;
	    
	    for(int i = 0; i < elementNum; i++) {
	    	if(firstArray[i] < secondArray[elementNum - a] && a <= changeNum) {
	    		int num = firstArray[i];
	    		firstArray[i] = secondArray[elementNum - a];
	    		System.out.println("a : " + a);
	    		a++;
	    	}else {
	    	}
	    }
		int sum = 0;
	    for(int i = 0; i < elementNum; i++) {
	    	sum += firstArray[i];
	    }
	    System.out.println("answer : " + Arrays.toString(firstArray));
	    System.out.println("sum : " + sum);
	}

}
