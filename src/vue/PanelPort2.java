package vue;

import javax.swing.*;
import java.awt.*;

public class PanelPort2 extends JPanel {
    JLabel labelBienvenue;

    public PanelPort2(){
        setLayout(new BorderLayout(20,20));
        labelBienvenue= new JLabel("Manche");
        this.add(labelBienvenue,BorderLayout.CENTER);
    }
}