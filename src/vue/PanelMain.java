package vue;
import controleur.Controleur;
import javax.swing.*;
import java.awt.*;

public class PanelMain extends JPanel {
    PanelChoix panelChoix = new PanelChoix();
    PanelAtlantique panelAtlantique = new PanelAtlantique();
    PanelManche panelManche = new PanelManche();
    PanelBienvenue panelBienvenue = new PanelBienvenue();
    JPanel panelCentre = new JPanel();

    public PanelMain () {
        setLayout(new BorderLayout(20,20));
        panelCentre = panelBienvenue;
        this.add(panelChoix,BorderLayout.NORTH);
        this.add(panelCentre, BorderLayout.CENTER);
        setBackground(Color.gray);
        Controleur controleur = new Controleur(panelBienvenue, panelChoix, this, panelAtlantique, panelManche);
    }

    public void changementPanel (JPanel parPanel){
        //this.removeAll();
        this.remove(panelCentre);
        panelCentre = parPanel;
        this.add(panelCentre,BorderLayout.CENTER);
    }
}
