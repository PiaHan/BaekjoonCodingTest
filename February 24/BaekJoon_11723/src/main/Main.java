package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] S = new int[20];
        int orderCount = Integer.parseInt(st.nextToken());
        int num = 0;
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i < orderCount; i++) {
        	st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	if(!command.equals("all") && !command.equals("empty")) {
        		num = Integer.parseInt(st.nextToken());
        		num = num - 1;
        	}
        	if(command.equals("add")) {
        		S[num] = 1;
        	}else if(command.equals("remove")) {
        		S[num] = 0;
        	}else if(command.equals("check")) {
        		if(S[num] == 1) {
        			bw.write("1"+"\n");
        			//sb.append(1).append('\n');
        			//System.out.println("1");
        		}else {
        			bw.write("0"+"\n");
        			//sb.append(0).append('\n');
        			//System.out.println("0");
        		}
        	}else if(command.equals("toggle")) {
        		if(S[num] == 1) {
        			S[num] = 0;
        		}else {
        			S[num] = 1;
        		}
        		
        	}else if(command.equals("all")) {
        		Arrays.fill(S, 1);
        	}else if(command.equals("empty")) {
        		Arrays.fill(S, 0);
        	}
        	
        }
        bw.flush();
        bw.close();
        //System.out.println(sb);
	}
}
