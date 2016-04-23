package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.LIGHT_GRAY);
		
		b1 = new JButton("Click Me");
		lab = new JLabel("DONT CLICk ME");
		
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
		
		new Calculator(); 
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number for conversion: ");
		num = sc.nextInt();
		
		sc.close();
	}
	
}
