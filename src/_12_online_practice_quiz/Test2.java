package _12_online_practice_quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test2 implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JTextField text = new JTextField();

	Test2() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(label);
		panel.add(text);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		label.setText("A woman shoots her husband, then holds him underwater for five minutes. Next, she hangs him. Right after, they enjoy a lovely dinner. Explain.");
		text.setColumns(10);
		button.setText("Submit");
		button2.setText("Hint");
		button.addActionListener(this);
		button2.addActionListener(this);
		
		
		frame.pack();
		
		

	}

	public static void main(String [] args) {
		Test2 test = new Test2();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		if(pressed.equals(button2)) {
			System.out.println("Don't think in a literal sense");
		}
		if(pressed.equals(button)) {
			String answer = text.getText();
			if(answer.equals("She took a photo of him and developed it in a darkroom")) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Try Again Please");
			}
			
		}

	}
}
