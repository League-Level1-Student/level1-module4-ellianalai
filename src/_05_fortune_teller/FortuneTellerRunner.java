package _05_fortune_teller;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	System.out.println("Hi. You shall find the location in the most basic place");
    }
}
