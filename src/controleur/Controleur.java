package controleur;

import vue.PanelAtlantique;
import vue.PanelChoix;
import vue.PanelMain;
import vue.PanelManche;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {
    PanelChoix panelChoix;
    PanelAtlantique panelAtlantique;
    PanelManche panelManche;
    PanelMain panelMain;

    public Controleur(PanelChoix parPanelChoix,PanelAtlantique parPanelAtlantique, PanelManche parPanelManche, PanelMain parPanelMain ) {
        panelChoix = parPanelChoix;
        panelAtlantique = parPanelAtlantique;
        panelManche = parPanelManche;
        panelMain = parPanelMain;
        panelChoix.enregistreEcouteur(this);
    }

    public void actionPerformed (ActionEvent parEvent) {
        if (parEvent.getSource() == panelChoix.ChoixDePort) {
            PanelChoix ChoixDePort = new PanelChoix(panelChoix.ChoixDePort.getSelectedItem());

            if (ChoixDePort.equals("Atlantique")){
                panelChoix.annonceChoix.setText("Vous avez choisi le port Atlantique");
                panelMain.changementPanel(panelAtlantique);}
            else if (ChoixDePort.equals("Manche")){
                panelChoix.annonceChoix.setText("Vous avez choisi le port Manche");
                panelMain.changementPanel(panelManche);}
            else
                panelChoix.annonceChoix.setText("Vous n'avez pas choisi de port");
        }
    }
}

