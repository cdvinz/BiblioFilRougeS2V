//Source file: D:\\JAVA\\TP\\BiblioFilRougeVrillaudPlumainSalin\\biblio\\metier\\Personne.java

package biblioFR.metier;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Personne: le concept de la Personne
 * @author V.Vrillaud
 *
 */
public class Personne 
{

/**
 * Attribut nom: le nom de la personne
 */
private String nom;
   /**
    * Accesseur getNom: accesseur sur le nom de la personne
    * @return nom: le nom de la personne
    */
	public String getNom() {return nom;}
	/**
	 * Mutateur setNom: mutateur sur le nom de la personne
	 * @param nom: le nom à attribuer à la personne
	 */
	public void setNom(String nom) {this.nom = nom;}
/**
 * Attribut prenom: le prénom de la personne
 */
private String prenom;
	/**
	 * Accesseur getPrenom: accesseur sur le prénom de la personne
	 * @return prenom: le prénom de la personne
	 */
	public String getPrenom() {return prenom;}
	/**
	 * Mutateur setPrenom: mutateur sur le prénom de la personne
	 * @param prenom: le prénom à attribuer à la personne
	 */
	public void setPrenom(String prenom) {this.prenom = prenom;}
/**
 * Attribut dateNaissance: la date de naissance de la personne
 */
private Date dateNaissance;
	/**
	 * Accesseur getDateNaissance: accesseur sur la date de naissance de la personne
	 * @return dateNaissance: la date de naissance de la personne
	 */
	public Date getDateNaissance() {return dateNaissance;}
	/**
	 * Mutateur setDateNaissance: mutateur sur la date de naissance de la personne
	 * @param dateNaissance: la date de naissance à attribuer à la personne
	 */
	public void setDateNaissance(Date dateNaissance) {this.dateNaissance = dateNaissance;}
/**
 * Attribut sexe: le sexe de la personne
 */
private String sexe;
	/**
	 * Accesseur getSexe: accesseur sur le sexe de la personne
	 * @return sexe: le sexe de la personne
	 */
	public String getSexe() {return sexe;}
	/**
	 * Mutateur setSexe: mutateur sur le sexe de la personne
	 * @param sexe: le sexe à attribuer à la personne
	 */
	public void setSexe(String sexe) {this.sexe = sexe;}
/**
 * SimpleDateFormat pour gérer la date au format "dd/MM/yyyy"
 */
public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

/**
 * Constructeur Personne à 4 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 */
public Personne(String nom,String prenom,Date dateNaissance,String sexe) {
	this.setNom(nom);
	this.setPrenom(prenom);
	this.setDateNaissance(dateNaissance);
	this.setSexe(sexe);
} ;
/**
 * Constructeur Personne à 3 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 */
public Personne(String nom,String prenom,Date dateNaissance) {this(nom,prenom,dateNaissance,"M");} ;
/**
 * Constructeur Personne à 2 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 */
public Personne(String nom,String prenom) {this(nom,prenom,new Date());} ;
/**
* Constructeur Personne sans parametre
*/
public Personne() {this("inconnu(e)","inconnu(e)");}


/**
 * toString redéfinie
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Personne [nom: "+this.getNom()+" * prénom: "+this.getPrenom()
	+" * date de naissance: "+sdf.format(this.getDateNaissance())+" * sexe: "+this.getSexe()+"]";
} ;
}
