//Source file: D:\\JAVA\\TP\\BiblioFilRougeVrillaudPlumainSalin\\biblio\\metier\\Employe.java

package biblioFR.metier;

import java.util.Date;

/**
 * Classe Employé: le concept de l'Employé
 * @author V.Vrillaud
 *
 */
public class Employe extends Utilisateur 
{
/**
 * Attribut codeMatricule: le code matricule de l'employé
 */
private String codeMatricule;
	/**
	 * Accesseur getCodeMatricule: accesseur sur le code matricule de l'employé
	 * @return codeMatricule: le code matricule de l'employé
	 */
	public String getCodeMatricule() {return codeMatricule;}
	/**
	 * Mutateur setCodeMatricule: mutateur sur le code matricule de l'employé
	 * @param codeMatricule: le code matricule à attribuer à l'employé
	 */
	public void setCodeMatricule(String codeMatricule) {this.codeMatricule = codeMatricule;}

/**
 * Enumération categorieEmploye: la catégorie de l'employé
 */
private EnumCategorieEmploye categorieEmploye;
	/**
	 * Accesseur getCategorieEmploye: accesseur sur la catégorie de l'employé
	 * @return categorieEmploye: la catégorie de l'employé
	 */
	public EnumCategorieEmploye getCategorieEmploye() {return categorieEmploye;}
	/**
	 * Mutateur setCategorieEmploye: mutateur sur la catégorie de l'employé
	 * @param categorieEmploye: la catégorie à attribuer à l'employé
	 */
	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {this.categorieEmploye = categorieEmploye;}

/**
 * Constructeur Employe à 9 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 * @param pwd: le mot de passe de l'utilisateur
 * @param pseudonyme: le pseudonyme de l'utilisateur
 * @param codeMatricule: le code matricule de l'employé
 * @param categorieEmploye: la catégorie de l'employé
 */
public Employe(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme,String codeMatricule,EnumCategorieEmploye categorieEmploye){
	super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
	this.setCodeMatricule(codeMatricule);
	this.setCategorieEmploye(categorieEmploye);
}
/**
 * Constructeur Employe à 8 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 * @param pwd: le mot de passe de l'utilisateur
 * @param pseudonyme: le pseudonyme de l'utilisateur
 * @param codeMatricule: le code matricule de l'employé
 */
public Employe(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme,String codeMatricule){
	super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
	this.setCodeMatricule(codeMatricule);
	this.setCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
}
/**
 * Constructeur Employe à 7 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 * @param pwd: le mot de passe de l'utilisateur
 * @param pseudonyme: le pseudonyme de l'utilisateur
 */
public Employe(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme){
	super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
	this.setCodeMatricule("inconnu");
	this.setCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
}
/**
 * Constructeur Employe sans paramètre
 */
public Employe(){
	super();
	this.setCodeMatricule("inconnu");
	this.setCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
}


/**
 * toString redéfinie
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString()+"\n\t - Employé [codeMatricule: "+this.getCodeMatricule()+" . categorieEmploye: "+this.getCategorieEmploye()+"]";
}
}
