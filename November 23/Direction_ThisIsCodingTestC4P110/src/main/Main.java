package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
							⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠚⠉⢣⠀⠀⠀
							⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠆⠀⠀⠀⡰⢁⡄⠀⠀⡞⠀⠀⠀
							⠀⠉⠢⡀⠀⠀⠀⠀⠀⡰⡿⠀⠀⠀⠀⠀⣇⢸⢳⠀⠀⡇⠀⠀⠀
							⠀⣠⡀⠘⢆⠀⠀⠀⠀⠸⣧⡀⠀⠀⠀⠀⢸⡘⢾⠀⢰⠃⠀⠀⠀
							⠳⡘⢿⣦⠈⡆⢀⣠⠴⠒⠛⠛⠓⠛⠛⠒⠚⠳⢤⣠⠏⠀⠀⠀⠀
							⠀⠙⠦⣝⡄⠁⠋⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀
							⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠻⠷⣦⡀⠀⠀⠀⠱⡀⠀⠀
							⠀⣸⠁⠀⠀⣴⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⡀⠀
							⠀⡇⠀⠀⢰⣿⠀⠀⠀⠀⠀⠀⢸⢧⡀⠀⠠⣄⠠⡄⠀⠀⠀⡇⠀
							⠀⡇⠀⠀⢸⠀⠢⡀⠐⣶⣄⣀⢸⣀⠙⠢⢤⣿⡆⡷⠒⢦⠀⠀⠀
							⠀⠻⣠⣤⢸⡀⠀⠈⠓⠾⠃⠈⠉⡉⠀⠀⠀⠀⢹⡇⠀⢀⠇⠀⠀
							⠀⢰⠁⠈⠻⣇⠀⠀⢸⡄⠀⣀⠀⠷⠀⠀⠀⠀⢀⣧⡤⠊⠀⢰⠀
							⠀⠈⠣⢄⣳⣄⡀⠀⠀⠀⠎⠒⠛⠄⠀⠀⢀⣠⠾⡇⠀⠀⠀⢸⠀
							⠀⠀⠀⠀⠠⡆⠙⠓⠦⠤⢤⣬⣥⣄⡰⠼⠛⠁⠀⡇⠀⠀⠀⢸⠀
							⠀⠀⠀⠀⢀⡇⠀⠀⢰⠛⠒⢶⢶⡖⠋⢹⡇⠀⢠⡇⠀⠀⠀⠀⣇
							⠀⠀⠀⠀⡸⠀⠀⠀⠘⣆⣠⣼⣛⢷⣤⣸⠀⠀⠘⠁⠀⠀⠀⠀⠘
							⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⢴⠁⣿⡄⠙⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
							 Eru Bless :      "No Bugs"
					
===========================================================

 */


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		String[] inputArray = br.readLine().split(" ");
		
//	   for (String element : inputArray) {
//            System.out.print(element + " ");
//        }
		
		int x = 1;
		int y = 1;
		
		System.out.println("length : " + inputArray.length);
		System.out.println("size : " + size);
		
		for(int i = 0; i < inputArray.length; i++) {
			if("L".equals(inputArray[i])) {
				if(x > 2) {
					x--;
				}
			}else if("R".equals(inputArray[i])) {
				if(x < size) {
					x++;
				}
			}else if("U".equals(inputArray[i])) {
				if(y > 2) {
					y--;
				}
			}else if("D".equals(inputArray[i])) {
				if(y < size) {
					y++;
				}
			}
		}
		
		System.out.println(y + " " + x);
		
	}
}
