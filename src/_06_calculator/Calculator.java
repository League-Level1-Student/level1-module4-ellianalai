package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JTextField text = new JTextField();
	JTextField text2 = new JTextField();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel label = new JLabel();
	
	void calculate() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		panel2.add(text);
		panel2.add(text2);
		panel3.add(add);
		panel3.add(subtract);
		panel3.add(multiply);
		panel3.add(divide);
		panel4.add(label);
		text.setColumns(10);
		text2.setColumns(10);
		add.setText("add");
		subtract.setText("subtract");
		multiply.setText("multiply");
		divide.setText("divide");
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.setSize(500,175);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		
		
			String t = text.getText();
			String te = text.getText();
			int i = Integer.parseInt(t);
			int in = Integer.parseInt(te);
			
			if(pressed == add) {
				int sum = i+in;
				String sums = Integer.toString(sum);
				label.setText(sums);
				frame.setSize(500,175);
			}
			
			if(pressed == subtract) {
				int dif = i-in;
				String diff = Integer.toString(dif);
				label.setText(diff);
				frame.setSize(500,175);
			}
			if(pressed == multiply) {
				int pro = i*in;
				String prod = Integer.toString(pro);
				label.setText(prod);
				frame.setSize(500,175);
			}
			if(pressed == divide) {
				int quo = i/in;
				String quot = Integer.toString(quo);
				label.setText(quot);
				frame.setSize(500,175);
			}
		
	}
	
}
