package biblioFR.test;

import java.util.GregorianCalendar;

import biblioFR.dao.ExemplairesDao;
import biblioFR.dao.UtilisateursDao;
import biblioFR.metier.Adherent;
import biblioFR.metier.Employe;
import biblioFR.metier.EmpruntEnCours;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) {
		ExemplairesDao ed2=new ExemplairesDao ();
		//Employe ad5=new Employe ("JOLY", "Angelina", new GregorianCalendar (1970,3,10).getTime(), "F", 5, "qwerty", "AJ","0669696969");
		UtilisateursDao ud1 = new UtilisateursDao();
		EmpruntEnCours empc2=new EmpruntEnCours(ud1.findByKey(4),ed2.findByKey(2),new GregorianCalendar (2017,2,15).getTime());
		System.out.println("Emprunt à l'heure :\n"+empc2+"\n");
		EmpruntEnCours empc3=new EmpruntEnCours(ud1.findByKey(4),ed2.findByKey(3),new GregorianCalendar (2017,2,15).getTime());
		System.out.println("Emprunt à l'heure :\n"+empc3+"\n");
		EmpruntEnCours empc1=new EmpruntEnCours(ud1.findByKey(4),ed2.findByKey(1),new GregorianCalendar (2017,2,15).getTime());
		System.out.println("Emprunt à l'heure :\n"+empc1+"\n");
		EmpruntEnCours empc4=new EmpruntEnCours(ud1.findByKey(4),ed2.findByKey(4),new GregorianCalendar (2017,2,15).getTime());
		System.out.println("Emprunt à l'heure :\n"+empc4+"\n");
	}
}
