package biblioFR.test;

import java.util.GregorianCalendar;
import biblioFR.dao.ExemplairesDao;
import biblioFR.dao.UtilisateursDao;
import biblioFR.metier.Adherent;
import biblioFR.metier.EmpruntEnCours;

public class TestAdherentEnRetard {
	public static void main(String[] args) {
		ExemplairesDao ed2=new ExemplairesDao ();
		Adherent ad5=new Adherent ("JOLY", "Angelina", new GregorianCalendar (1970,3,10).getTime(), "F", 5, "qwerty", "AJ","0669696969");
		//Adhérent+emprûnt en retard
		EmpruntEnCours empc2=new EmpruntEnCours(ad5,ed2.findByKey(2),new GregorianCalendar (2017,0,25).getTime());
		System.out.println(empc2);
		System.out.println(ad5.getIsPretEnRetard());
		//Adhérent+emprûnt non retard
		EmpruntEnCours empc3=new EmpruntEnCours(ad5,ed2.findByKey(1),new GregorianCalendar (2017,2,15).getTime());
		System.out.println(empc3);
		System.out.println(ad5.getIsPretEnRetard());
	}
}
