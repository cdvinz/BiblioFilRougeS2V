package biblioFR.test;

import java.util.GregorianCalendar;

import biblioFR.metier.EmpruntEnCours;
import biblioFR.metier.Exemplaire;
import biblioFR.metier.Utilisateur;

public class TestEmpruntEnCours {
	public static void main(String[] args) {
		Utilisateur u6=new Utilisateur();
		Exemplaire ex1=new Exemplaire();
		System.out.println(ex1+"\n");
		EmpruntEnCours empc1=new EmpruntEnCours(u6,ex1,new GregorianCalendar (2017,0,25).getTime());
		System.out.println(empc1+"\n");
		System.out.println(empc1.getExemplaire()+"\n");
		
	}
}
