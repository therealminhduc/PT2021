package vue;

//import controleur.Controleur;

import controleur.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelChoix extends JPanel {
    JLabel labelChoisi;
    JLabel labelChoixDePort;
    public JButton boutonAtlantique;
    public JButton boutonManche;
    public JLabel annonceChoix;
    Controleur controleur;

    public PanelChoix() {
        setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        contraintes.insets = new Insets(6, 6, 6, 6);
        contraintes.anchor = GridBagConstraints.WEST;

        //labelChoisi
        labelChoisi = new JLabel("BIENVENUE AU CALENDRIER DES MARÉES");
        contraintes.gridx = 0;
        contraintes.gridy = 0;
        contraintes.gridwidth = 3;
        this.add(labelChoisi, contraintes);

        //labelChoixDePort
        labelChoixDePort = new JLabel("Choississez votre port : ");
        contraintes.gridx = 0;
        contraintes.gridy = 2;
        contraintes.gridwidth = 3;
        this.add(labelChoixDePort, contraintes);

        boutonAtlantique = new JButton("ATLANTIQUE");
        contraintes.gridx = 1; contraintes.gridy = 3;
        boutonAtlantique.setBackground(Color.LIGHT_GRAY);
        this.add(boutonAtlantique, contraintes);

        boutonManche = new JButton("MANCHE");
        contraintes.gridx = 2; contraintes.gridy = 4;
        boutonManche.setBackground(Color.LIGHT_GRAY);
        this.add(boutonManche, contraintes);
    }

    public void enregistreEcouteur (Controleur controleur) {
        boutonAtlantique.addActionListener((ActionListener) controleur);
        boutonManche.addActionListener((ActionListener) controleur);
    }
}
