//Source file: D:\\JAVA\\TP\\BiblioFilRougeVrillaudPlumainSalin\\biblio\\metier\\Adherent.java

package biblioFR.metier;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import biblioFR.exception.BiblioException;

/**
 * Classe Adherent: le concept de l'Adhérent
 * @author V.Vrillaud
 *
 */
public class Adherent extends Utilisateur 
{
	/**
	 * Attribut telephone: le numéro de téléphone de l'adhérent
	 */
	private String telephone;
	/**
	 * Accesseur getTelephone: accesseur sur le numéro de téléphone de l'adhérent
	 * @return telephone: le numéro de téléphone de l'adhérent
	 */
	public String getTelephone() {return telephone;}
	/**
	 * Mutateur setTelephone: mutateur sur le numéro de téléphone de l'adhérent
	 * @param telephone: le numéro de téléphone à attribuer à l'adhérent
	 */
	public void setTelephone(String telephone) {this.telephone = telephone;}
	/**
	 * Attribut statique nbMaxPrets: le nombre maximal de prêts autorisé par adhérent
	 */
	private static Integer nbMaxPrets = 3;
	/**
	 * Attribut statique dureeMaxPrets: la durée maximale d'un prêt autorisée (en jours)
	 */
	private static Integer dureeMaxPrets = 15;
	/**
	 * Attribut nbRetards: le nombre de retards de l'adhérent
	 */
	private int nbRetards=0;
	/**
	 * Accesseur getNbRetard: accesseur sur le nombre de retard de l'adhérent
	 * @return nbRetards: le nombre de retards de l'adhérent
	 */
	public Integer getNbRetards(){
		GregorianCalendar gc=new GregorianCalendar();								
		gc.add (Calendar.DAY_OF_YEAR,-dureeMaxPrets);								
		Date dateMinSansRetard=gc.getTime();
		nbRetards=0;
		for (EmpruntEnCours empc:this.getEmpruntEnCours()){
			boolean test=false;
			test=(dateMinSansRetard.after(empc.getDateEmprunt()));
			if (test){
				nbRetards++;
			}
		}

		return this.nbRetards;
	}

	/**
	 * Constructeur Adherent à 8 paramètres
	 * @param nom: le nom à attribuer à la personne
	 * @param prenom: le prénom à attribuer à la personne
	 * @param dateNaissance: la date de naissance à attribuer à la personne
	 * @param sexe: le sexe à attribuer à la personne
	 * @param idUtilisateur: l'identifiant de l'utilisateur
	 * @param pwd: le mot de passe de l'utilisateur
	 * @param pseudonyme: le pseudonyme de l'utilisateur
	 * @param telephone: le numéro de téléphone de l'adhérent
	 */
	public Adherent(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme,String telephone){
		super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
		this.setTelephone(telephone);
	}
	/**
	 * Constructeur Adherent à 7 paramètres
	 * @param nom: le nom à attribuer à la personne
	 * @param prenom: le prénom à attribuer à la personne
	 * @param dateNaissance: la date de naissance à attribuer à la personne
	 * @param sexe: le sexe à attribuer à la personne
	 * @param idUtilisateur: l'identifiant de l'utilisateur
	 * @param pwd: le mot de passe de l'utilisateur
	 * @param pseudonyme: le pseudonyme de l'utilisateur
	 */
	public Adherent(String nom,String prenom,Date dateNaissance,String sexe,int idUtilisateur,String pwd,String pseudonyme){
		super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
		this.setTelephone("inconnu");
	}
	/**
	 * Constructeur Adherent sans paramètre
	 */
	public Adherent(){
		super();
		this.setTelephone("inconnu");
	}

	/**
	 * toString redéfinie
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"\n\t - Adhérent [téléphone: "+this.getTelephone()+" . nbMaxPrêts: "+nbMaxPrets+" . duréeMaxPrêt: "+dureeMaxPrets+" jours]";
	}

	/**
	 * Méthode isConditionsPretAcceptees: vérification des conditions de prêt
	 * @return boolean: si les conditions de prêt sont acceptées ou non
	 */
	public boolean isConditionsPretAcceptees() {
		if (this.getNbRetards()==0 && this.getNbEmpruntsEnCours()<3){
			return true ;
		}
		else{
			try {
				throw new BiblioException("condition non remplie");
			} catch (BiblioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;	
		}
	}

	/* (non-Javadoc)
	 * @see biblioFR.metier.Utilisateur#addEmpruntEnCours(biblioFR.metier.EmpruntEnCours)
	 */
	@Override
	public void addEmpruntEnCours(EmpruntEnCours empc) {
		if(isConditionsPretAcceptees()){
			getEmpruntEnCours().add(empc);
		}
		
}
}
