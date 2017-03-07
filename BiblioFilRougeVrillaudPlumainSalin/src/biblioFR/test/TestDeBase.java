package biblioFR.test;

import java.util.Date;

import biblioFR.dao.ExemplairesDao;
import biblioFR.dao.UtilisateursDao;
import biblioFR.metier.EmpruntEnCours;

public class TestDeBase {

	public static void main(String[] args) {
		ExemplairesDao ed1=new ExemplairesDao ();
		System.out.println(ed1.findByKey(1)+"\n");
		System.out.println(ed1.findByKey(2)+"\n");
		UtilisateursDao ud1=new UtilisateursDao ();
		System.out.println(ud1.findByKey(5)+"\n");
		System.out.println(ud1.findByKey(3)+"\n");
		EmpruntEnCours empc1=new EmpruntEnCours (ud1.findByKey(5),ed1.findByKey(1),new Date());
		System.out.println(empc1+"\n");
		System.out.println(empc1.getEmprunteur().getEmpruntEnCours()+"\n");
		//empc1.getEmprunteur().addEmpruntEnCours(empc1);
		ud1.findByKey(5).addEmpruntEnCours(empc1);
		//System.out.println(empc1.getEmprunteur().getEmpruntEnCours()+"\n");
		empc1.setEmprunteur(ud1.findByKey(3));
	}
}
