package biblio.dao;
import java.util.GregorianCalendar;
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
				// new Employe ("Samuel", "Azerty", "SamSam", EnumCategorieEmploye.BIBLIOTHECAIRE),
				new Utilisateur ("DEFUNES", "Louis", new GregorianCalendar (1915,0,20).getTime(), "H", 2, "azerty", "LD"),
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








