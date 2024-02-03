package _10_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	void slot() throws MalformedURLException {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(createLabelImage("bannana.png"));
		frame.pack();
	}
	
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
}
