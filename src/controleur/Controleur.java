package controleur;

import constantes.ConstantesPorts;
import vue.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {
    PanelBienvenue panelBienvenue;
    PanelChoix panelChoix;
    PanelMain panelMain;
    PanelPort1 panelPort1;
    PanelPort2 panelPort2;

    public Controleur(PanelBienvenue parPanelBienvenue, PanelChoix parPanelChoix, PanelMain parPanelMain, PanelPort1 parPanelPort1, PanelPort2 parPanelPort2) {
        panelBienvenue = parPanelBienvenue;
        panelChoix = parPanelChoix;
        panelMain = parPanelMain;
        panelPort1 = parPanelPort1;
        panelPort2 = parPanelPort2;
        panelChoix.enregistreEcouteur(this);
    }

    public void actionPerformed(ActionEvent parEvent) {
        if (parEvent.getSource() == panelChoix.boutonAtlantique) {
            panelMain.changementPanel(ConstantesPorts.ATLANTIQUE);
        }
        else if (parEvent.getSource() == panelChoix.boutonManche) {
            panelMain.changementPanel(ConstantesPorts.MANCHE);
        }
    }
}