package vue;
import controleur.Controleur;
import javax.swing.*;
import java.awt.*;

public class PanelMain extends JPanel {
    PanelChoix panelChoix = new PanelChoix();
    PanelPort1 panelPort1 = new PanelPort1();
    PanelPort2 panelPort2 = new PanelPort2();
    PanelBienvenue panelBienvenue = new PanelBienvenue();
    JPanel panelCentre = new JPanel();

    CardLayout cL = new CardLayout(); //pour afficher les differents panels
    String [] tags = {"panelBienvenue", "panelAtlantique", "panelManche"}; //tags des panels pour la methode addLayoutComponent

    public PanelMain () {
        panelCentre.setLayout(cL); //panelCentre gere par un diaporama

        // panelCentre gere 3 panels grâce au cardLayout :
        panelCentre.add(panelBienvenue, tags[0]);
        panelCentre.add(panelPort1, tags[1]);
        panelCentre.add(panelPort2, tags[2]);
        cL.show(panelCentre, tags[0]); //on affiche panelBienvenue

        setLayout(new BorderLayout(20,20));

        this.add(panelChoix,BorderLayout.NORTH);
        this.add(panelCentre, BorderLayout.CENTER);

        setBackground(Color.gray);
        Controleur controleur = new Controleur(panelBienvenue, panelChoix, this, panelPort1, panelPort2);
    }

    public void changementPanel (int indiceTag){
        cL.show(panelCentre, tags[indiceTag]);

    }
}
