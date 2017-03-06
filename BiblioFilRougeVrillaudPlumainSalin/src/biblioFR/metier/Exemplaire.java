//Source file: C:\\Users\\vincent\\workspaceJAVA\\biblio\\metier\\Exemplaire.java

package biblioFR.metier;

import java.util.*;
import static biblioFR.metier.Personne.sdf;

public class Exemplaire 
{
	private Integer idExemplaire;
	/*
	private static Integer idExemplaire = 1;
	 */
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	//private Livre livre;
	public EmpruntEnCours theEmpruntEnCours;

	/**
	 * @param idExemplaire
	 * @param dateAchat
	 * @param status
	 * @param isbn
	 * @param theEmpruntEnCours
	 */
	public Exemplaire(Integer idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn,EmpruntEnCours theEmpruntEnCours) {
		setIdExemplaire(idExemplaire);
		setDateAchat(dateAchat);
		setStatus(status);
		setIsbn(isbn);
		setTheEmpruntEnCours(theEmpruntEnCours);
	}
	
	/**
	 * @param idExemplaire
	 * @param dateAchat
	 * @param status
	 * @param isbn
	 */
	public Exemplaire(Integer idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn) {
		this(idExemplaire, dateAchat, status, isbn, null);
	}
	
	/**
	 * @param idExemplaire
	 * @param dateAchat
	 * @param status
	 */
	public Exemplaire(Integer idExemplaire, Date dateAchat, EnumStatusExemplaire status) {
		this(idExemplaire, dateAchat, status, "inconnu");
	}
	
	/**
	 * @param idExemplaire
	 * @param dateAchat
	 */
	public Exemplaire(Integer idExemplaire, Date dateAchat) {
		this(idExemplaire, dateAchat, EnumStatusExemplaire.DISPONIBLE);
	}
	
	/**
	 * @param idExemplaire
	 */
	public Exemplaire(Integer idExemplaire) {
		this(idExemplaire, new Date());
	}
	
	/**
	 * @roseuid 5241490A0167
	 */
	public Exemplaire() {
		this(0);
	}

	
	/**
	 * @return the idExemplaire
	 */
	public Integer getIdExemplaire() {
		return idExemplaire;
	}

	/**
	 * @param idExemplaire the idExemplaire to set
	 */
	public void setIdExemplaire(Integer idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	/**
	 * @return the dateAchat
	 */
	public Date getDateAchat() {
		return dateAchat;
	}

	/**
	 * @param dateAchat the dateAchat to set
	 */
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	/**
	 * @return the status
	 */
	public EnumStatusExemplaire getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	} 

	/**
	 * @return the theEmpruntEnCours
	 */
	public EmpruntEnCours getTheEmpruntEnCours() {
		return theEmpruntEnCours;
	}

	/**
	 * @param theEmpruntEnCours the theEmpruntEnCours to set
	 */
	public void setTheEmpruntEnCours(EmpruntEnCours theEmpruntEnCours) {
		this.theEmpruntEnCours = theEmpruntEnCours;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exemplaire [ idExemplaire=" + getIdExemplaire()	+ ", dateAchat=" + sdf.format(getDateAchat()) + ", isbn=" + getIsbn() 
		+ ", theEmpruntEnCours=" + getTheEmpruntEnCours() + "]";
	}

	public static void main(String args[]){

	}
}
