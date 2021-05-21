package vue;

import javax.swing.JButton;
import modele.Date;

public class BoutonDate extends JButton{
    private Date date;

    public BoutonDate(Date date) {
        super (Integer.toString(date.getJour()));
        this.date= date;
    }

    public void setDate (Date parDate){
        this.date = parDate;
    }

    public Date getDate() {
        return date;
    }
}
