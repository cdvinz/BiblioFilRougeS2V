package biblioFR.test;
import biblioFR.metier.Employe;
import java.text.ParseException;
import static biblioFR.metier.Personne.sdf;
import biblioFR.metier.EnumCategorieEmploye;

/**
 * Classe de tests Employe
 * @author V.Vrillaud
 *
 */
public class TestEmploye {
	public static void main(String[] args) throws ParseException {
		Employe e1=new Employe();
		System.out.println("Test Employé sans paramètre:\n"+"\t"+e1);
		Employe e2=new Employe("Her","Xavier",sdf.parse("18/10/1969"),"M",907412,"yoyo","xh");
		System.out.println("Test Employé à 7 paramètres:\n"+"\t"+e2);
		Employe e3=new Employe("Plumain","Vincent",sdf.parse("28/09/1980"),"M",514871,"fou","vp","1AZ10");
		System.out.println("Test Employé à 8 paramètres:\n"+"\t"+e3);
		Employe e4=new Employe("Gandon","Sylvie",sdf.parse("01/01/1974"),"F",125014,"bibi","ss","1AZ10",EnumCategorieEmploye.RESPONSABLE);
		System.out.println("Test Employé à 9 paramètres:\n"+"\t"+e4);
	}
}
