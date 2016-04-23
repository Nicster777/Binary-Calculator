package main;

import java.util.Scanner;

public class Calculator {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] binary = new int[8]; // 0 0 0 0 0 0 0 0
		
		int num;
		
		
		System.out.println("Enter a number for conversion: ");
		num = sc.nextInt();
		
		while (num > 0) {
			while (num >= 128) {
				binary[0] = 1;
				num -= 128;
			}
			
			while (num >= 64) {
				
			}
			
			while (num >= 32) {
				
			}
			
			while (num >= 16) {
				
			}
			
			while (num >= 8) {
				
			}
			
			while (num >= 4) {
				
			}
			
			while (num >= 2) {
				
			}
			
			while (num >= 1) {
				
			}
		}
		
		
		sc.close();
	}
	
}
