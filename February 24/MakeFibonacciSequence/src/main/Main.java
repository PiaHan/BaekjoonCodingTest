package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long beforeTime = System.currentTimeMillis();
		int answer = fibonacci(num);
		System.out.println("answer : " + answer);
		
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("시간차이(m) : "+secDiffTime);
		
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
