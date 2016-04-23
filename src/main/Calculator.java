package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.*;

public class Calculator {
	
	
	private JFrame f;	
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	
	public Calculator() {
		gui();
	}
	
	public void gui() {
		f = new JFrame("Calculator");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		
		b1 = new JButton("Click Me");
		lab = new JLabel("DONT CLICk ME");
		
		p.add(b1, BorderLayout.CENTER);
		p.add(lab);
		
		f.add(p);
	}
	
	public static void main (String[] args) {
		
		new Calculator(); 
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number for conversion: ");
		num = sc.nextInt();
		
		sc.close();
	}
	
}
