package vue;

import modele.CalendrierDuMois;
import constantes.ConstantesCalendrier;
import modele.Date;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMois extends JPanel implements ActionListener, ConstantesCalendrier {

    public JLabel []  labelJours = new JLabel [JOURS_SEMAINE_ABR.length];
    public Date ajd = new Date();
    BoutonDate bouton = new BoutonDate(ajd);


    public PanelMois(int numMois) {

        CalendrierDuMois calendrier = new CalendrierDuMois(numMois, ajd.getAnnee());

        setLayout(new GridLayout(0,7,3,3));

        for (int i = 0; i < labelJours.length; i++) {
            this.add(new JLabel (JOURS_SEMAINE_ABR[i]));
        }

        for (Date date:calendrier.getDates()) {
            BoutonDate boutonDate = new BoutonDate (date);
            boutonDate.setDate(date);
            boutonDate.setBackground(Color.lightGray);
            boutonDate.addActionListener(this);

            if (date.compareTo(ajd) == 0)
                boutonDate.setBackground(Color.red);
            this.add(boutonDate);
        }

    }

    public void actionPerformed (ActionEvent parEvent) {
        BoutonDate boutonSelect = (BoutonDate) parEvent.getSource();
        if (bouton != boutonSelect){
            if (bouton.getDate().compareTo(ajd) == 0){
                bouton.setBackground(Color.red);
            }
            else
                bouton.setBackground(Color.lightGray);
        }

        if (parEvent.getSource() == boutonSelect){
            boutonSelect.setBackground(Color.green);
            bouton = boutonSelect;
        }
    }
}
