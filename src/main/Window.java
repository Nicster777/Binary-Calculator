package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window {

	private JFrame frame;
	private JTextField numberField;
	private JTextField binaryField;

	public Window(String title) {
		initialize(title);
	}

	private void initialize(String title) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JButton ConverButton = new JButton("Convert");

		ConverButton.setBounds(185, 127, 89, 23);
		frame.getContentPane().add(ConverButton);
		
		numberField = new JTextField();
		numberField.setBounds(122, 32, 152, 20);
		frame.getContentPane().add(numberField);
		numberField.setColumns(10);
		
		binaryField = new JTextField();
		binaryField.setEditable(false);
		binaryField.setBounds(122, 78, 152, 20);
		frame.getContentPane().add(binaryField);
		binaryField.setColumns(10);
		
		JLabel binaryLabel = new JLabel("Binary Number");
		binaryLabel.setBounds(10, 81, 102, 14);
		frame.getContentPane().add(binaryLabel);
		
		JLabel numberLabel = new JLabel("Enter A Number");
		numberLabel.setBounds(10, 35, 102, 14);
		frame.getContentPane().add(numberLabel);
		
		frame.setVisible(true);
		frame.setTitle(title);
		frame.setSize(300, 200);
		
		ConverButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				Converter con = new Converter();
				
				try {
					binaryField.setText(con.convert(Integer.parseInt(numberField.getText())));
				} catch (NumberFormatException e) {
					System.out.println("Invalid Input -- '" + numberField.getText() + "' is not a valid integer.");
				}
			}
		});
	}
}
