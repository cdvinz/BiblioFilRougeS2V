package biblioFR.test;
import biblioFR.metier.Personne;
import java.text.ParseException;
import static biblioFR.metier.Personne.sdf;

/**
 * Classe de tests Personne
 * @author V.Vrillaud
 *
 */
public class TestPersonne {
	public static void main(String[] args) throws ParseException {
		Personne p1=new Personne();
		System.out.println("Test Personne sans paramètre: "+p1);
		Personne p2=new Personne("Her","Xavier");
		System.out.println("Test Personne à 2 paramètres: "+p2);
		Personne p3=new Personne("Plumain","Vincent",sdf.parse("28/09/1980"));
		System.out.println("Test Personne à 3 paramètres: "+p3);
		Personne p4=new Personne("Gandon","Sylvie",sdf.parse("01/01/1974"),"F");
		System.out.println("Test Personne à 4 paramètres: "+p4);
	}
}
