package vue;

import javax.swing.*;
import java.awt.*;

public class PanelAtlantique extends JPanel {
    JLabel labelBienvenue;

    public PanelAtlantique (){
        setLayout(new BorderLayout(20,20));
        labelBienvenue= new JLabel("Atlantique");
        this.add(labelBienvenue,BorderLayout.CENTER);
    }
}
