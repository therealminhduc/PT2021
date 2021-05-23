package controleur;

import vue.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {
    PanelBienvenue panelBienvenue;
    PanelChoix panelChoix;
    PanelMain panelMain;
    PanelAtlantique panelAtlantique;
    PanelManche panelManche;

    public Controleur(PanelBienvenue parPanelBienvenue, PanelChoix parPanelChoix, PanelMain parPanelMain, PanelAtlantique parPanelAtlantique, PanelManche parPanelManche) {
        panelBienvenue = parPanelBienvenue;
        panelChoix = parPanelChoix;
        panelMain = parPanelMain;
        panelAtlantique = parPanelAtlantique;
        panelManche = parPanelManche;
        panelChoix.enregistreEcouteur(this);
    }

    public void actionPerformed(ActionEvent parEvent) {
        if (parEvent.getSource() == panelChoix.boutonAtlantique) {
            panelMain.changementPanel(panelAtlantique);
            System.out.println("nique");
        }
        else if (parEvent.getSource() == panelChoix.boutonManche) {
            panelMain.changementPanel(panelManche);
            System.out.println("ta mere");

        }
    }
}