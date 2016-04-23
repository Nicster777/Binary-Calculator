package main;

import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long mask = 0x8000, test;

		System.out.println("Enter a number for conversion: ");
		int num = sc.nextInt();
		
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

		sc.close();
	}
}
