package vue;

import controleur.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelChoix extends JPanel {
    JLabel labelChoisi;

    JLabel labelChoixDePort;
    public JComboBox<String> ChoixDePort;
    String[] lesPorts = {"Atlantique", "Manche"};

    public JLabel annonceChoix;

    JLabel item1;
    JLabel item2;

    Controleur controleur;

    public PanelChoix(Object selectedItem) {
        //PanelChoix s = new PanelChoix();

        setLayout(new GridBagLayout());
        GridBagConstraints contraintes = new GridBagConstraints();
        contraintes.insets = new Insets(6, 6, 6, 6);
        contraintes.anchor = GridBagConstraints.WEST;

        //labelChoisi
        labelChoisi = new JLabel("BIENVENUE AU CALENDRIER DES MARRÉES");
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

        //ChoixDePort.addItemListener(s);

        //ChoixDePort
        ChoixDePort = new JComboBox<String>(lesPorts);
        ChoixDePort.getEditor().getEditorComponent().setBackground(Color.GRAY);
        contraintes.gridx = 1;
        contraintes.gridy = 3;
        contraintes.gridwidth = 2;
        this.add(ChoixDePort, contraintes);

        //zone annonceChoix
        annonceChoix = new JLabel("");
        contraintes.gridy = 4;
        contraintes.gridx = 1;
        this.add(annonceChoix, contraintes);

        item1 = new JLabel("Atlantique sélectionné");
        item1.setForeground(Color.BLUE);
        item2 = new JLabel("Manche sélectionné");
        item2.setForeground(Color.BLUE);
    }

    /*public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == ChoixDePort) {

            item1.setText(ChoixDePort.getSelectedItem() + "selected");
        }
    }*/

    public void enregistreEcouteur (Controleur controleur) {
        ChoixDePort.addActionListener((ActionListener) controleur);
    }
}
