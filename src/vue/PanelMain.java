package vue;

import javax.swing.*;
import java.awt.*;

public class PanelMain extends JPanel {
    PanelChoix panelChoix;
    PanelCalendrier panelCalendrier;

    public PanelMain () {
        setLayout(new BorderLayout(20,20));
        panelChoix = new PanelChoix ();
        panelCalendrier = new PanelCalendrier();

        this.add(panelChoix,BorderLayout.NORTH);
        this.add(panelCalendrier, BorderLayout.CENTER);
        setBackground(Color.gray);
    }
}
