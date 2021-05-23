package vue;

import javax.swing.*;
import java.awt.*;

public class PanelBienvenue extends JPanel{
    JLabel bienvenue;
    public PanelBienvenue(){
        setLayout (new BorderLayout(10,10));
        bienvenue = new JLabel("Bonjour");
        this.add(bienvenue, BorderLayout.CENTER);
    }

}
