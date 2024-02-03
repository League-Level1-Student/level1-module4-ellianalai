package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button;
	Random ran = new Random();

	void whack() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		drawButtons(ran);
		frame.setSize(275,315);
	}
	
	void drawButtons(Random rand) {
		for(int i = 0; i<24; i++) {
			button = new JButton();
			panel.add(button);
			
		}
		rand.nextInt(24);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
