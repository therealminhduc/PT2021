package vue;

import modele.Date;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PanelBienvenue extends JPanel{
    Date dateFormulaire;
    GregorianCalendar actualHour = new GregorianCalendar ();
    GregorianCalendar actualMinute = new GregorianCalendar ();
    GregorianCalendar actualSecond = new GregorianCalendar();

    public PanelBienvenue(){
        setLayout (new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.insets = new Insets (4,4,4,4);

        dateFormulaire = new Date ();
        JLabel etiquetteDate = new JLabel("Bonjour, on est le " + dateFormulaire.toString() + ", " + actualHour.get(Calendar.HOUR_OF_DAY) + "h " + actualMinute.get(Calendar.MINUTE) + "min " + actualSecond.get(Calendar.SECOND) + "s ");
        contrainte.gridwidth = 2;
        add(etiquetteDate, contrainte);
    }
}
