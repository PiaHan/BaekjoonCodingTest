package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] sList;
	public static int[] fList;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int sCnt = Integer.parseInt(st.nextToken());
	    sList = new int[sCnt];
	    
	    st = new StringTokenizer(br.readLine());
	    
	    for(int i = 0; i < sCnt; i++) {
	    	sList[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    st = new StringTokenizer(br.readLine());
	    int fCnt = Integer.parseInt(st.nextToken());
	    fList = new int[fCnt];
	    
	    st = new StringTokenizer(br.readLine());
	    
	    Arrays.sort(sList);
	    
	    
	    for(int i = 0; i < fCnt; i++) {
	    	fList[i] = Integer.parseInt(st.nextToken());
	    	int a = binarySearch(0, (sCnt-1), fList[i]);
	    	
	    	if(a == 1) {
	    		System.out.print("yes ");
	    	}else {
	    		System.out.print("no ");
	    	}
	    }
	}
	
	public static int binarySearch(int start, int end, int value) {
		
		if(start>end) {
			return 0;
		}
		
		int mid = (start +end)/2;
		
		if(sList[mid] == value) {
			return 1;
		}else if(sList[mid] < value) {
			return binarySearch(mid+1, end, value);
		}else {
			return binarySearch(start, mid - 1, value);
		}
	}

}
