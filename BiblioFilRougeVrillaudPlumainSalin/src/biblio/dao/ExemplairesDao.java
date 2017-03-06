package biblio.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import biblioFR.metier.EmpruntEnCours;
import biblioFR.metier.EnumStatusExemplaire;
import biblioFR.metier.Exemplaire;
//import biblioFR.metier.Livre;
import static biblioFR.metier.Personne.sdf;

/**
 * @author SALIN
 * 
 */
public class ExemplairesDao throws throws ParseException
{


	/**   Emule la Base de donn�e des Exemplaires de Livre */

	private static Exemplaire [] exemplairesDB = {  

			new Exemplaire (1, sdf.parse ("12/01/2017"),EnumStatusExemplaire.DISPONIBLE, "1111111"),
			new Exemplaire (2, sdf.parse ("10/02/2017"),EnumStatusExemplaire.PRETE, "0022222"),
			new Exemplaire (3, sdf.parse ("01/03/2017"),EnumStatusExemplaire.SUPPRIME, "0033333")};


	/**
	 * @return the exemplairesDB
	 */
	public static Exemplaire [] getExemplairesDB() {return exemplairesDB;}

	/**
	 * @param exemplairesDB the exemplairesDB to set
	 */
	public static void setExemplairesDB(Exemplaire [] exemplairesDB) {ExemplairesDao.exemplairesDB = exemplairesDB;}


	public Exemplaire findByKey (int idExemplaire)
	{
		for (Exemplaire exemplaire : exemplairesDB) {if (exemplaire.getIdExemplaire() == idExemplaire )return exemplaire;return null;}
	}
}
