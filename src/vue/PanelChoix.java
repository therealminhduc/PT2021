package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PanelChoix extends JPanel implements ItemListener {
    JLabel labelChoisi;

    JLabel labelChoixDePort;
    JComboBox<String> ChoixDePort;
    String[] lesPorts = {"Atlantique", "Manche"};

    JLabel item1;
    JLabel item2;

    public PanelChoix() {
        PanelChoix s = new PanelChoix();

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
        ChoixDePort.addItemListener(s);

        //ChoixDePort
        ChoixDePort = new JComboBox<String>(lesPorts);
        ChoixDePort.getEditor().getEditorComponent().setBackground(Color.GRAY);
        contraintes.gridx = 1;
        contraintes.gridy = 3;
        contraintes.gridwidth = 2;
        this.add(ChoixDePort, contraintes);

        item1 = new JLabel("Atlantique sélectionné");
        item1.setForeground(Color.BLUE);
        item2 = new JLabel("Manche sélectionné");
        item2.setForeground(Color.BLUE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == ChoixDePort) {

            item1.setText(ChoixDePort.getSelectedItem() + "selected");
        }
    }
}
