package main;

public class Converter {
	long mask = 0x8000, test;
	String output = "";
	
	public String convert(int num) {
		int x = 0;
		while (mask != 0) {
			test = (num & mask);
			String out = (test != 0) ? "1" : "0";
			output += out;
			
			mask = mask >> 1;
			x++;
			if (x == 8) {
				output += " ";
				x = 0;
			}
		}
		return output;
	}
}
