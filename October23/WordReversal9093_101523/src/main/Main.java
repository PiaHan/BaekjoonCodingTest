package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int lineNum = Integer.parseInt(br.readLine());
	    String[] arr = new String[lineNum];
	     
	     for(int i=0; i <lineNum; i++) {
	    	 arr[i] = br.readLine();	
	    	 String[] strArray = arr[i].split(" ");
	    	 
	    	 for(int j = 0; j < strArray.length; j++) {
	    		 char[] chars = strArray[j].toCharArray();
	    		 for(int t = chars.length-1; t >= 0; t--) {
	    			 sb.append(chars[t]);
	    		 }
	    		 sb.append(' ');
	    	 }
	    	 sb.append('\n');
	     }
	     
	     System.out.println(sb);
		
	    
		
	}

}
