package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 Map<String, Integer> map = new HashMap<>();
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st = new StringTokenizer(br.readLine());
		
	     int studentNum = Integer.parseInt(st.nextToken());
	     
	     for(int i = 0; i < studentNum; i++) {
	        st = new StringTokenizer(br.readLine());
	        
	        String name = st.nextToken();
	        int grade = Integer.parseInt(st.nextToken());
	        
	        map.put(name, grade);
	        	
	     }
	     
	     List<String> keySet = new ArrayList<>(map.keySet());
	     Collections.sort(keySet);
	     
	     for (String key : keySet) {
            System.out.print(key + " ");
        }
	}
}
