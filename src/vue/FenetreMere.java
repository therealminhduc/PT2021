package vue;

import javax.swing.JFrame ;

public class FenetreMere extends JFrame {

    public FenetreMere (String parTitre) {
        super (parTitre);
        PanelMain contentPane = new PanelMain();
        setContentPane (contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //setLocation(400,300);
        setSize(700,700);
    }

    public static void main (String  [] args) {
        new FenetreMere ("Horaire des marrees");
    }
}