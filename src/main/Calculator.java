package main;

import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] binary = new int[8]; // 0 0 0 0 0 0 0 0
		
		boolean broke = false;
		
		int num;
		
		
		System.out.println("Enter a number for conversion: ");
		num = sc.nextInt();
		
		while (num > 0) {
			
			if (num > 128) {
				System.out.println("Enter a number equal to or smaller than 128.");
				broke = true;
				break;
			}
			
			if (num == 128) {
				binary[0] = 1;
				num -= 128;
			} else if (num >= 64) {
				binary[1] = 1;
				num -= 64;
			} else if (num >= 32) {
				binary[2] = 1;
				num -= 32;
			} else if (num >= 16) {
				binary[3] = 1;
				num -= 16;
			} else if (num >= 8) {
				binary[4] = 1;
				num -= 8;
			} else if (num >= 4) {
				binary[5] = 1;
				num -= 4;
			} else if (num >= 2) {
				binary[6] = 1;
				num -= 2;
			} else if (num >= 1) {
				binary[7] = 1;
				num -= 1;
			}
		}
		
		for(int i = 0; i < 8; i++) {
			if (!broke) {
				System.out.print(binary[i]);
			}
		}
		
		sc.close();
	}
	
}
