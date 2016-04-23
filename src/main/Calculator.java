package main;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Scanner;

import javax.swing.*;

public class Calculator {
	
	private String version = "v0.0.1";
	
	private JFrame f;	
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	private JTextArea out;
	private JTextField numIn;
	
	public Calculator() {
		gui();
	}
	
	public void gui() {
		f = new JFrame("Calculator " + version);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.LIGHT_GRAY);
		
		b1 = new JButton("Calculate");
		lab = new JLabel("Enter a Number: ");
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10, 10, 10, 10);
		
		c.gridx = 0;
		c.gridy = 1;
		p.add(b1,c);
		
		c.gridx = 0;
		c.gridy = 2;
		p.add(lab,c);
		
		f.add(p);
	}
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		long mask = 0x8000, test;

	
		new Calculator(); 
		

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
