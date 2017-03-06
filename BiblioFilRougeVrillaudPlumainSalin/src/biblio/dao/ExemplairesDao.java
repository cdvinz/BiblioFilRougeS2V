package biblio.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import biblioFR.metier.EmpruntEnCours;
import biblioFR.metier.EnumStatusExemplaire;
import biblioFR.metier.Exemplaire;
//import biblioFR.metier.Livre;

/**
 * @author SALIN
 * 
 */
public class ExemplairesDao {

	
	/**   Emule la Base de donnée des Exemplaires de Livre */
	
	private static Exemplaire [] exemplairesDB = {  
		
		 new Exemplaire (1, new GregorianCalendar (2017,01,12),EnumStatusExemplaire.DISPONIBLE, "1111111"),
		 new Exemplaire (2, new GregorianCalendar (2017,02,10),EnumStatusExemplaire.PRETE, "0022222"),
		 new Exemplaire (3, new GregorianCalendar (2017,03,1),EnumStatusExemplaire.SUPPRIME, "0033333")};

	
	/**
	 * @return the exemplairesDB
	 */
	public static Exemplaire [] getExemplairesDB() {
		return exemplairesDB;
	}

	/**
	 * @param exemplairesDB the exemplairesDB to set
	 */
	public static void setExemplairesDB(Exemplaire [] exemplairesDB) {
		ExemplairesDao.exemplairesDB = exemplairesDB;
	}
	
			
				public Exemplaire findByKey (int idExemplaire) {
					for (Exemplaire exemplaire : exemplairesDB) {
						if (exemplaire.getIdExemplaire() == idExemplaire )
							return exemplaire;
		}
	}
	

	
}
