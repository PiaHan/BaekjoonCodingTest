package main;

import java.util.Scanner;

public class Adv_Fibo {
	public static int[] d = new int[100];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long beforeTime = System.currentTimeMillis();
		int answer = fibonacci(num);
		System.out.println("answer : " + answer);
		long afterTime = System.currentTimeMillis(); 
		long secDiffTime = afterTime - beforeTime;
		System.out.println("시간차이(m) : "+secDiffTime);
		
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		if(d[n] != 0) {
			return d[n];
		}
		
		d[n] = fibonacci(n-1) + fibonacci(n-2);
		return d[n];
	}
}
