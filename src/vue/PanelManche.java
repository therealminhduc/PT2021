package vue;

import javax.swing.*;
import java.awt.*;

public class PanelManche extends JPanel {
    JLabel labelBienvenue;

    public PanelManche (){
        setLayout(new BorderLayout(20,20));
        labelBienvenue= new JLabel("Manche");
        this.add(labelBienvenue,BorderLayout.CENTER);
    }
}