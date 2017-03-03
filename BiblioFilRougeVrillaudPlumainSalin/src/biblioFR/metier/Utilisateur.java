//Source file: D:\\JAVA\\TP\\BiblioFilRougeVrillaudPlumainSalin\\biblio\\metier\\Utilisateur.java

package biblioFR.metier;

import java.util.Date;

/**
 * Classe Utilisateur: le concept de l'Utilisateur
 * @author V.Vrillaud
 *
 */
public class Utilisateur extends Personne 
{
/**
 * Attribut idUtilisateur: l'identifiant de l'utilisateur
 */
private Integer idUtilisateur;
   /**
    * Accesseur getIdUtilisateur: accesseur sur l'identifiant de l'utilisateur
    * @return idUtilisateur: l'identifiant de l'utilisateur
    */
	public Integer getIdUtilisateur() {return idUtilisateur;}
	/**
	 * Mutateur getIdUtilisateur: mutateur sur l'identifiant de l'utilisateur
	 * @param idUtilisateur: l'identifiant à attribuer à l'utilisateur
	 */
	public void setIdUtilisateur(Integer idUtilisateur) {this.idUtilisateur = idUtilisateur;}
/**
 * Attribut pwd: le mot de passe de l'utilisateur
 */
private String pwd;
	/**
	 * Accesseur getPwd: accesseur sur l'identifiant de l'utilisateur
	 * @return pwd: le mot de passe de l'utilisateur
	 */
	public String getPwd() {return pwd;}
	/**
	 * Mutateur setPwd: mutateur sur le mot de passe de l'utilisateur
	 * @param pwd: le mot de passe à attribuer à l'utilisateur
	 */
	public void setPwd(String pwd) {this.pwd = pwd;}
/**
 * Attribut pseudonyme: le pseudonyme de l'utilisateur
 */
private String pseudonyme;
	/**
	 * Accesseur getPseudonyme: accesseur sur le pseudonyme de l'utilisateur
	 * @return pseudonyme: le pseudonyme de l'utilisateur
	 */
	public String getPseudonyme() {return pseudonyme;}
	/**
	 * Mutateur setPseudonyme: mutateur sur le pseudonyme de l'utilisateur
	 * @param pseudonyme: le pseudonyme à attribuer à l'utilisateur
	 */
	public void setPseudonyme(String pseudonyme) {this.pseudonyme = pseudonyme;}
///**
// * Attribut EmpruntEnCours: l'emprûnt (ou les emprûnts) en cours de l'utilisateur
// */
//private EmpruntEnCours empruntEnCours[];
//	/**
//	 * Mutateur setEmpruntEnCours: mutateur sur l'emprûnt (ou les emprûnts) en cours de l'utilisateur
//	 * @param empruntEnCours: l'emprûnt (ou les emprûnts) en cours de l'utilisateur
//	 */
//	public void setEmpruntEnCours(EmpruntEnCours[] empruntEnCours) {this.empruntEnCours = empruntEnCours;}
   
/**
 * Constructeur Utilisateur à 7 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 * @param pwd: le mot de passe de l'utilisateur
 * @param pseudonyme: le pseudonyme de l'utilisateur
 */
public Utilisateur(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme) {
	super(nom,prenom,dateNaissance,sexe);
	this.setIdUtilisateur(idUtilisateur);
	this.setPwd(pwd);
	this.setPseudonyme(pseudonyme);
}
/**
 * Constructeur Utilisateur à 6 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 * @param pwd: le mot de passe de l'utilisateur
 */
public Utilisateur(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd) {
	super(nom,prenom,dateNaissance,sexe);
	this.setIdUtilisateur(idUtilisateur);
	this.setPwd(pwd);
	this.setPseudonyme("inconnu");
}
/**
 * Constructeur Utilisateur à 5 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 * @param idUtilisateur: l'identifiant de l'utilisateur
 */
public Utilisateur(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur) {
	super(nom,prenom,dateNaissance,sexe);
	this.setIdUtilisateur(idUtilisateur);
	this.setPwd("inconnu");
	this.setPseudonyme("inconnu");
}
/**
 * Constructeur Utilisateur à 4 paramètres
 * @param nom: le nom à attribuer à la personne
 * @param prenom: le prénom à attribuer à la personne
 * @param dateNaissance: la date de naissance à attribuer à la personne
 * @param sexe: le sexe à attribuer à la personne
 */
public Utilisateur(String nom,String prenom,Date dateNaissance,String sexe) {
	super(nom,prenom,dateNaissance,sexe);
	this.setIdUtilisateur(0);
	this.setPwd("inconnu");
	this.setPseudonyme("inconnu");
}
/**
 * Constructeur Utilisateur sans paramètre
 */
public Utilisateur() {
	super();
	this.setIdUtilisateur(0);
	this.setPwd("inconnu");
	this.setPseudonyme("inconnu");
}


/** 
 * toString redéfinie
 * (non-Javadoc)
 * @see biblioFR.metier.Personne#toString()
 */
@Override
public String toString() {
	return super.toString()+"\n\t - Utilisateur [idUt: "+this.getIdUtilisateur()+" | pwd: "+this.getPwd()+" | pseudo: "+this.getPseudonyme()+"]";
}
//	/**
//    * @param ep
//    * @author V.Vrillaud
//    */
//   public void addEmpruntEnCours(EmpruntEnCours ep) 
//   {
//    
//   }
//   
//   /**
//    * @return biblio.metier.EmpruntEnCours[ ]
//    * @author V.Vrillaud
//    */
//  public EmpruntEnCours[ ] getEmpruntEnCours() 
//   {
//    return null;
//   }
//   
//   /**
//    * @return Integer
//    * @author V.Vrillaud
//    */
//   public Integer getNbEmpruntsEnCours() 
//   {
//    return null;
//   }
}
