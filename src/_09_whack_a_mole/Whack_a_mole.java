package _09_whack_a_mole;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button;
	Date timeAtStart = new Date();
	Random ran = new Random();
	int score = 0;

	void whack() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		drawButtons();
		frame.setSize(275,315);
	}

	void drawButtons() {
		int r = ran.nextInt(24);
		for(int i = 0; i<24; i++) {
			JButton button2 = new JButton();
			button2.addActionListener(this);
			panel.add(button2);
			if(i==r) {
				button2.setText("Mole");	
				button = button2;
			}

		}	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();

		if(pressed == button) {
			score+=1;
			panel.removeAll();
			drawButtons();
		}
		if(pressed != button) {
			speak("Miss");
		}
		
		if(score==10) {
			endGame(timeAtStart, 10);
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked) { 
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
				+ " moles per second.");
	}
	
    static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

}
