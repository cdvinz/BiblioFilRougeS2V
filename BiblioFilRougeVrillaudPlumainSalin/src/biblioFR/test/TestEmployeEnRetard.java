package biblioFR.test;

import java.util.GregorianCalendar;

import biblioFR.dao.ExemplairesDao;
import biblioFR.metier.Adherent;
import biblioFR.metier.Employe;
import biblioFR.metier.EmpruntEnCours;

public class TestEmployeEnRetard {
	public static void main(String[] args) {
		ExemplairesDao ed2=new ExemplairesDao ();
		Employe ad5=new Employe ("JOLY", "Angelina", new GregorianCalendar (1970,3,10).getTime(), "F", 5, "qwerty", "AJ","0669696969");
		System.out.println(ad5+"\n");
		EmpruntEnCours empc2=new EmpruntEnCours(ad5,ed2.findByKey(2),new GregorianCalendar (2017,0,25).getTime());
		System.out.println("Emprunt en retard :\n"+empc2+"\n");
		EmpruntEnCours empc3=new EmpruntEnCours(ad5,ed2.findByKey(1),new GregorianCalendar (2017,2,15).getTime());
		System.out.println("Emprunt à l'heure :\n"+empc3+"\n");
//		System.out.println("n° de retard\n"+ad5.getNbRetards()+"\n");
		System.out.println("liste :\n"+ad5.getEmpruntEnCours()+"\n");
		System.out.println("nbr emprunt : "+ad5.getEmpruntEnCours().size());
	}

}
