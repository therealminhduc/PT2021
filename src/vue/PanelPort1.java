package vue;

import constantes.ConstantesCalendrier;
import modele.Date;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPort1 extends JPanel implements ActionListener, ConstantesCalendrier {
    /*JLabel labelBienvenue;

    public PanelAtlantique (){
        setLayout(new BorderLayout(20,20));
        labelBienvenue= new JLabel("Atlantique");
        this.add(labelBienvenue,BorderLayout.CENTER);*/
    Date ajd = new Date();

    //pour panel sud
    JPanel panelSud = new JPanel ();
    JButton[] boutons = new JButton[INTITULES_BOUTONS.length];

    //pour panel centre
    JLabel labelNomMois = new JLabel(MOIS[0]);
    JPanel panelCentre = new JPanel ();
    CardLayout cardLayout = new CardLayout(10,10);

    int cpt = 0;

    public PanelPort1() {
        setLayout (new BorderLayout (10,10));

        // previous next last first
        for(int iTitre = 0; iTitre < INTITULES_BOUTONS.length; iTitre++) {
            boutons[iTitre] = new JButton(INTITULES_BOUTONS[iTitre]);
            boutons[iTitre].setBackground(Color.gray);
            boutons[iTitre].addActionListener(this);
            panelSud.add(boutons[iTitre]);
        }

        //situe tout en bas
        add(panelSud, BorderLayout.SOUTH);
        panelCentre.setLayout(cardLayout);

        //le mois, calendrier
        for (int i = 0; i < MOIS.length; i++) {
            PanelMois panelMois = new PanelMois(i+1);
            panelCentre.add(panelMois, MOIS[i]);
        }
        panelSud.add(labelNomMois);

        //situe au centre
        add(panelCentre, BorderLayout.CENTER);
        setBackground (new Color (128,128,128));


        //se place dans le mois courant
        cardLayout.show(panelCentre, MOIS[ajd.getMois()-1]);
        cpt = ajd.getMois()-1;

    }


    //actionPerformed
    @Override
    public void actionPerformed(ActionEvent parEvt) {

        //first
        if (parEvt.getSource() == boutons[0] ) {
            cardLayout.first(panelCentre);
            cpt = 0;
        }

        //previous
        if (parEvt.getSource() == boutons[1] ) {
            cardLayout.previous(panelCentre);
            cpt--;

            if (cpt < 0)
                cpt = MOIS.length - 1;
        }

        //next
        if (parEvt.getSource() == boutons[2] ) {
            cardLayout.next(panelCentre);
            cpt++;

            if (cpt > MOIS.length - 1)
                cpt = 0;
        }

        //last
        if (parEvt.getSource() == boutons[3] ) {
            cardLayout.last(panelCentre);
            cpt = MOIS.length - 1;

        }
        labelNomMois.setText(MOIS[cpt]);
    }
}
