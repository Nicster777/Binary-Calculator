package main;

import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		long mask = 0x800000, test;

		System.out.println("Enter a number for conversion: ");

		long num = sc.nextInt();
		//preNum = num;
		
		
		
		/*while (num > 0) {
			
			
			if (num >= 128) {
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
		}*/
		
		
		int x = 0;
		
		while (mask != 0) {
			test = (num & mask);
			String out = (test != 0) ? "1" : "0";
			System.out.print(out);
			mask = mask >> 1;
			x++;
			if (x == 8) {
				System.out.print(" ");
				x = 0;
			}
			
		}
		
		
		/*if(preNum > 255) {
			for(int i = 0; i < numOut; i++) {
				
			}
			
			for(int i = 0; i < 8; i++) {
				System.out.print(binary[i]);
			}
		} else {
			for(int i = 0; i < 8; i++) {
				System.out.print(binary[i]);
			}
		}*/
		
		sc.close();
	}
	
}
