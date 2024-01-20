package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();

	void makeButtons(){
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button);
		panel.add(button2);
		button.setText("Joke");
		button2.setText("Punchline");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}
	public static void main (String args []){
		ChuckleClicker ChuckleClicker = new ChuckleClicker();
		ChuckleClicker.makeButtons();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "Why did the starfish cross the road");
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "To get to the other tide");
		}

	}
}
