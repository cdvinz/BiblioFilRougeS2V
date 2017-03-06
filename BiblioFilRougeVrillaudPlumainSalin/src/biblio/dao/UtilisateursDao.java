package biblio.dao;
import java.util.GregorianCalendar;

import biblioFR.metier.Adherent;
import biblioFR.metier.Employe;

import biblioFR.metier.EnumCategorieEmploye;
import biblioFR.metier.Utilisateur;

/**
 * @author SALIN 
 */

public class UtilisateursDao {

	/**   Emule la Base de donnée des Exemplaires **/

	private static Utilisateur [] utilisateursDB = 
		{  


				// Chaque utilisateur doit avoir les attributs = nom, Prenom, dateNaiss, sexe(string), Id(integer), pwd(sting), pseudo(string) 
				new Utilisateur ("JACKSON", "Samuel", new GregorianCalendar (1960,0,20).getTime(), "H", 1, "azerty", "SJ"),
				
				new Utilisateur ("DEFUNES", "Louis", new GregorianCalendar (1915,0,20).getTime(), "H", 2, "azerty", "LD"),
		// Chaque utilisateur doit avoir les attributs = nom, Prenom, dateNaiss, sexe(string), Id(integer), pwd(sting), pseudo(string) 
				new Employe ("WILLYS", "Bruce", new GregorianCalendar (1958,1,12).getTime(), "H", 3, "qwerty", "WB","codeMAt1" , EnumCategorieEmploye.BIBLIOTHECAIRE),
				new Employe ("NORRIS", "Chuck", new GregorianCalendar (1950,2,10).getTime(), "H", 3, "qwerty", "LD","CodeMat2" , EnumCategorieEmploye.RESPONSABLE),
				new Adherent ("JOLY", "Angelina", new GregorianCalendar (1970,3,10).getTime(), "F", 4, "qwerty", "AJ","0669696969")
		};


	/**
	 * @return the utilisateurDB
	 */
	public static Utilisateur [] getUtilisateursDB() {return utilisateursDB;}

	/**
	 * @param exemplairesDB the exemplairesDB to set
	 */
	public static void setUtilisateursDB(Utilisateur [] utilisateursDB) {UtilisateursDao.utilisateursDB = utilisateursDB;}


	public Utilisateur findByKey (int idUtilisateur)
	{
		for (Utilisateur utilisateur : utilisateursDB) {
			if (utilisateur.getIdUtilisateur() == idUtilisateur ) return utilisateur;}return null;
	}
}








