//Source file: C:\\Users\\vincent\\workspaceJAVA\\biblio\\metier\\EmpruntEnCours.java

package biblioFR.metier;

import java.util.Date;
import static biblioFR.metier.Personne.sdf;

/**
 * Concept de l'Emprûnt en cours
 * @author V.Plumain
 *
 */
public class EmpruntEnCours 
{
	/**
	 * Attribut dateEmprunt: la date d'emprûnt
	 */
	private Date dateEmprunt;
	/**
	 * Attribut exemplaire: l'exemplaire
	 */
	private Exemplaire exemplaire;
	/**
	 * Attribut emprunteur: l'emprûnteur
	 */
	private Utilisateur emprunteur;


	/**
	 * Constructeur EmpruntEnCours à 3 paramètres
	 * @param dateEmprunt: la date d'emprûnt
	 * @param exemplaire: l'exemplaire
	 * @param emprunteur: l'emprûnteur
	 */
	public EmpruntEnCours(Utilisateur emprunteur, Exemplaire exemplaire, Date dateEmprunt) {
		setEmprunteur(emprunteur);
		setExemplaire(exemplaire);
		setDateEmprunt(dateEmprunt);
	}

	/**
	 * Constructeur EmpruntEnCours à 2 paramètres
	 * @param dateEmprunt: la date d'emprûnt
	 * @param exemplaire: l'exemplaire
	 */
	public EmpruntEnCours(Utilisateur emprunteur, Exemplaire exemplaire) {
		this(emprunteur, exemplaire, new Date());
	}
	
	/**
	 * Constructeur EmpruntEnCours à 1 paramètre
	 * @param dateEmprunt: la date d'emprûnt
	 */
	public EmpruntEnCours(Utilisateur emprunteur) {
		this(emprunteur, null);
	}
	
	/**
	 * Constructeur EmpruntEnCours sans paramètres
	 */
	public EmpruntEnCours() {
		this(null);
		}

	/**
	 * Accesseur getDateEmprunt: accesseur sur la date d'emprûnt
	 * @return dateEmprunt: la date d'emprûnt
	 */
	public Date getDateEmprunt() {return dateEmprunt;}

	/**
	 * Mutateur setDateEmprunt: mutateur sur la date d'emprûnt
	 * @param dateEmprunt: la date d'emprûnt
	 */
	public void setDateEmprunt(Date dateEmprunt) {this.dateEmprunt=dateEmprunt;}

	/**
	 * Accesseur getExemplaire: accesseur sur l'exemplaire
	 * @return exemplaire: l'exemplaire
	 */
	public Exemplaire getExemplaire() {return exemplaire;}

	/**
	 * Mutateur setExemplaire: mutateur sur l'exemplaire
	 * @param exemplaire: l'exemplaire à attribuer
	 */
	public void setExemplaire(Exemplaire exemplaire) {this.exemplaire = exemplaire;}

	/**
	 * Accesseur getEmprunteur: accesseur sur l'emprûnteur
	 * @return emprunteur: l'emprûnteur
	 */
	public Utilisateur getEmprunteur() {return emprunteur;}

	/**
	 * Mutateur setEmprunteur: mutateur sur l'emprûnteur
	 * @param emprunteur: l'emprûnteur à attribuer
	 */
	public void setEmprunteur(Utilisateur emprunteur) {this.emprunteur = emprunteur;}

	/** 
	 * toString redéfinie
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt=" + sdf.format(getDateEmprunt()) + ", exemplaire=" + getExemplaire()
				+ ", emprunteur=" + getEmprunteur() + "]";
	}
}
