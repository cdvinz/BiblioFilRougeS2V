package biblioFR.test;

import java.util.Date;

import biblioFR.dao.ExemplairesDao;
import biblioFR.dao.UtilisateursDao;
import biblioFR.metier.EmpruntEnCours;
import biblioFR.metier.EnumStatusExemplaire;

public class TestDeBase {

	public static void main(String[] args) {
		ExemplairesDao ed1=new ExemplairesDao ();
		System.out.println("test1 "+ed1.findByKey(1)+"\n");
		System.out.println("test2 "+ed1.findByKey(2)+"\n");
		UtilisateursDao ud1=new UtilisateursDao ();
		System.out.println("test3 "+ud1.findByKey(5)+"\n");
		System.out.println("test4 "+ud1.findByKey(3)+"\n");
		EmpruntEnCours empc1=new EmpruntEnCours (ud1.findByKey(5),ed1.findByKey(1),new Date());
		System.out.println("test5 "+empc1+"\n");
		EmpruntEnCours empc2=new EmpruntEnCours (ud1.findByKey(3),ed1.findByKey(2),new Date());
		System.out.println("test6 "+empc2+"\n");
		//System.out.println("test7"+empc2.getEmprunteur().getEmpruntEnCours()+"\n");
		//empc1.getEmprunteur().addEmpruntEnCours(empc1);
		//ud1.findByKey(5).addEmpruntEnCours(empc1);
		//System.out.println(empc1.getEmprunteur().getEmpruntEnCours()+"\n");
		//empc1.setEmprunteur(ud1.findByKey(3));
		//System.out.println(empc1.getExemplaire()+"\n");
	}
}
