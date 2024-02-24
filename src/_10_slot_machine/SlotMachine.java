package _10_slot_machine;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton button = new JButton();
	Random ran = new Random();
	int score;
	
	
	String [] images = {
			"banana.png",
			"cherry.png",
			"Diamond.png",
			"grape.png",
			"lemon.png",
			"orange.png",
			"seven.png",
			"strawberry.png",
			"watermelon.png"
	};
	void slot() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel3);
		panel3.add(panel);
		panel3.add(panel2);
		panel.add(createLabelImage("banana.png"));
		panel.add(createLabelImage("diamond.png"));
		panel.add(createLabelImage("cherry.png"));
		panel2.add(button);
		button.setText("Spin");
		button.setSize(200, 10);
		button.addActionListener(this);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		frame.pack();
	}



	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		panel.removeAll();
		String s = images[ran.nextInt(8)];
		String t = images[ran.nextInt(8)];
		String v = images[ran.nextInt(8)];
		panel.add(createLabelImage(s));
		panel.add(createLabelImage(t));
		panel.add(createLabelImage(v));
		
		if(s.equals(t) && s.equals(v) && t.equals(v)) {
			JOptionPane.showMessageDialog(null, "You Win!");
			score+=1;
			if(score == 1) {
				System.out.println("You have won " + score + " time");
			}
			else {
				System.out.println("You have won " + score + " times");
			}
			
		}
		frame.pack();
		
		
	}

}
