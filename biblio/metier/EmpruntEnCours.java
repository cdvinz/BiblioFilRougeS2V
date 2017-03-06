//Source file: C:\\Users\\vincent\\workspaceJAVA\\biblio\\metier\\EmpruntEnCours.java

package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntEnCours 
{
	private Date dateEmprunt;
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	//SimpleDateFormat sdf = new SimpleDateFormat("DD");


	/**
	 * @param dateEmprunt
	 * @param exemplaire
	 * @param emprunteur
	 */
	public EmpruntEnCours(Date dateEmprunt, Exemplaire exemplaire, Utilisateur emprunteur) {
		setDateEmprunt(dateEmprunt);
		setExemplaire(exemplaire);
		setEmprunteur(emprunteur);
	}

	/**
	 * @param dateEmprunt
	 * @param exemplaire
	 */
	public EmpruntEnCours(Date dateEmprunt, Exemplaire exemplaire) {
		this(dateEmprunt, exemplaire, null);
	}

	/**
	 * @param dateEmprunt
	 */
	public EmpruntEnCours(Date dateEmprunt) {
		this(dateEmprunt, null);
	}

	/**
	 * @roseuid 5241490A01C5
	 */
	public EmpruntEnCours() {
		this(null);
	}

	/**
	 * @return the dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	/**
	 * @param d
	 * @roseuid 4CA4A51A038A
	 */
	public void setDateEmprunt(Date d) {

	}

	/**
	 * @return the exemplaire
	 */
	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	/**
	 * @param exemplaire the exemplaire to set
	 */
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	/**
	 * @return the emprunteur
	 */
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}

	/**
	 * @param emprunteur the emprunteur to set
	 */
	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt=" + getDateEmprunt() + ", exemplaire=" + getExemplaire()
				+ ", emprunteur=" + getEmprunteur() + "]";
	}
	public static void main(String args[]){

	}

}
