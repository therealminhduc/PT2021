package vue;

//import controleur.Controleur;

import javax.swing.*;
import java.awt.*;

public class PanelMain extends JPanel {
    PanelChoix panelChoix;
    PanelCalendrier panelCalendrier;
    PanelAtlantique panelAtlantique = new PanelAtlantique();
    PanelManche panelManche = new PanelManche();

    public PanelMain () {
        setLayout(new BorderLayout(20,20));
        panelChoix = new PanelChoix();
        panelCalendrier = new PanelCalendrier();
        //panelCentre = panelCalendrier;
        this.add(panelChoix,BorderLayout.NORTH);
        this.add(panelCalendrier, BorderLayout.CENTER);
        setBackground(Color.gray);

        //Controleur controleur = new Controleur(panelChoix, panelAtlantique, panelManche, this);
    }
}
